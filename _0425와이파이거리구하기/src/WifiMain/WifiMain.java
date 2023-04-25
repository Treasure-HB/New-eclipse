package WifiMain;

import java.util.ArrayList;
import java.util.List;

import WifiItem.WifiItem;
import WifiItemDao.WifiItemDao;
import WifiItemService.WifiItemService;

public class WifiMain {

	public static void main(String[] args) {

			//각 클래스 호출함
			WifiItemService wifiItemService = new WifiItemService();
			WifiItemDao wifiItemDao = new WifiItemDao();
			List <WifiItem> wifiItems = wifiItemDao.selectAll();
			
			//1. wifiitem에 me라는 객체 만들어서 내 위치 고정함
			WifiItem me = new WifiItem();
			me.setLatitude("37.3860521");
			me.setLongitude("127.1214038");
			
				//1-1. 조건에 맞는 wifiitems 리스트 행을 바로 저장할 객체 선언
				WifiItem far = null;
				WifiItem close = null;
			
			//2. 최소 최대 변수선언
			double maxDistance = Double.MIN_VALUE;
			double minDistance = Double.MAX_VALUE;
				
			//3.wifiItems 라는 리스트를 target이라는 변수에 하나씩 넣어서 반복해라
			for(WifiItem target : wifiItems) {
				//3-3. me(고정값)과 target(wifiitems 리스트값)을 계산한 거리가 최대/최소 값이라면 far/close 에 넣어라
				double d = wifiItemService.getDistance(me, target);
				if(d >= maxDistance) {
					far = target; 
					maxDistance = d;
				}
				if(d < minDistance) {
					close= target;
					minDistance = d;
				}
			}
			
			System.out.println("***********최대거리************");
			System.out.printf("%s\n%s\n%s\n%s\n",far.getId(),far.getInstallationLocationName(),far.getRoadNameAddress(),maxDistance);
			System.out.println();
			System.out.println("***********최소거리************");
			System.out.printf("%s\n%s\n%s\n%s\n",close.getId(),close.getInstallationLocationName(),close.getRoadNameAddress(),minDistance);
			
		

	}

}

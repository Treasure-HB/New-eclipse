package WifiMain;

import java.util.ArrayList;
import java.util.List;

import WifiItem.WifiItem;
import WifiItemDao.WifiItemDao;
import WifiItemService.WifiItemService;

public class WifiMain {

	public static void main(String[] args) {

			//�� Ŭ���� ȣ����
			WifiItemService wifiItemService = new WifiItemService();
			WifiItemDao wifiItemDao = new WifiItemDao();
			List <WifiItem> wifiItems = wifiItemDao.selectAll();
			
			//1. wifiitem�� me��� ��ü ���� �� ��ġ ������
			WifiItem me = new WifiItem();
			me.setLatitude("37.3860521");
			me.setLongitude("127.1214038");
			
				//1-1. ���ǿ� �´� wifiitems ����Ʈ ���� �ٷ� ������ ��ü ����
				WifiItem far = null;
				WifiItem close = null;
			
			//2. �ּ� �ִ� ��������
			double maxDistance = Double.MIN_VALUE;
			double minDistance = Double.MAX_VALUE;
				
			//3.wifiItems ��� ����Ʈ�� target�̶�� ������ �ϳ��� �־ �ݺ��ض�
			for(WifiItem target : wifiItems) {
				//3-3. me(������)�� target(wifiitems ����Ʈ��)�� ����� �Ÿ��� �ִ�/�ּ� ���̶�� far/close �� �־��
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
			
			System.out.println("***********�ִ�Ÿ�************");
			System.out.printf("%s\n%s\n%s\n%s\n",far.getId(),far.getInstallationLocationName(),far.getRoadNameAddress(),maxDistance);
			System.out.println();
			System.out.println("***********�ּҰŸ�************");
			System.out.printf("%s\n%s\n%s\n%s\n",close.getId(),close.getInstallationLocationName(),close.getRoadNameAddress(),minDistance);
			
		

	}

}

package WifiItemService;

import WifiItem.WifiItem;

public class WifiItemService {

	
	public double getDistance(WifiItem wifiItem1, WifiItem wifiItem2) {
		
		//전역변수로 double형 getter를 생성해 그걸 호출함
		double dist = Math.sqrt(Math.pow(wifiItem1.gettodouble1() - wifiItem2.gettodouble1(), 2)
					+ Math.pow(wifiItem1.gettodouble2() - wifiItem2.gettodouble2(), 2));

		
		return dist;
	}
	
}

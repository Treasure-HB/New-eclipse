package WifiItemService;

import WifiItem.WifiItem;

public class WifiItemService {

	
	public double getDistance(WifiItem wifiItem1, WifiItem wifiItem2) {
		
		//���������� double�� getter�� ������ �װ� ȣ����
		double dist = Math.sqrt(Math.pow(wifiItem1.gettodouble1() - wifiItem2.gettodouble1(), 2)
					+ Math.pow(wifiItem1.gettodouble2() - wifiItem2.gettodouble2(), 2));

		
		return dist;
	}
	
}

package WifiItemDao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import WifiItem.WifiItem;

public class WifiItemDao {

		//csv파일을 모두 읽어올 메소드 설정
		public List<WifiItem> selectAll() {
			
			//arraylist변수이름 ret으로 설정
			List<WifiItem> ret = new ArrayList<WifiItem>();

			try {
				File f = new File("C:\\Users\\HB\\Desktop\\자바 심화(홍교수님)\\PublicWifi.txt");// 파일객체생성
				BufferedReader br;
				br = new BufferedReader(new FileReader(f)); // buffered를 이용해 파일읽기 객체 생성

				String field[];
				String readtxt = br.readLine();
				
				
				while ((readtxt = br.readLine()) != null) { //readLine : 한줄씩읽는거
					field = readtxt.split("\t"); //tap으로 나눈걸 field에 넣음

					WifiItem wifiitem = new WifiItem(); //field 하나씩 wifiitem 전역변수에 넣기
					wifiitem.setId(field[0]); 
					wifiitem.setInstallationLocationName(field[1]);
					wifiitem.setInstallationLocationDetails(field[2]);
					wifiitem.setInstallationCityName(field[3]);
					wifiitem.setInstallationDistrictName(field[4]);
					wifiitem.setInstallationFacilityType(field[5]);
					wifiitem.setServiceProvidrName(field[6]);
					wifiitem.setWifiSsid(field[7]);
					wifiitem.setDateOfInstallaion(field[8]);
					wifiitem.setRoadNameAddress(field[9]);
					wifiitem.setLotNumberAddress(field[10]);
					wifiitem.setManagementAgencyName(field[11]);
					wifiitem.setManagementAgencyPhoneNumber(field[12]);
					wifiitem.setLatitude(field[13]);
					wifiitem.setLongitude(field[14]);
					wifiitem.setCreated(field[15]);

					ret.add(wifiitem);
				}

				br.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

			return ret;
		}
	
}

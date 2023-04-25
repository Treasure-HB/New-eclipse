package WifiItemDao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import WifiItem.WifiItem;

public class WifiItemDao {

		//csv������ ��� �о�� �޼ҵ� ����
		public List<WifiItem> selectAll() {
			
			//arraylist�����̸� ret���� ����
			List<WifiItem> ret = new ArrayList<WifiItem>();

			try {
				File f = new File("C:\\Users\\HB\\Desktop\\�ڹ� ��ȭ(ȫ������)\\PublicWifi.txt");// ���ϰ�ü����
				BufferedReader br;
				br = new BufferedReader(new FileReader(f)); // buffered�� �̿��� �����б� ��ü ����

				String field[];
				String readtxt = br.readLine();
				
				
				while ((readtxt = br.readLine()) != null) { //readLine : ���پ��д°�
					field = readtxt.split("\t"); //tap���� ������ field�� ����

					WifiItem wifiitem = new WifiItem(); //field �ϳ��� wifiitem ���������� �ֱ�
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

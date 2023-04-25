package WifiItem;

public class WifiItem {

	//csv파일을 저장할 전역변수선언
	private String id;
	private String InstallationLocationName;
	private String InstallationLocationDetails;
	private String InstallationCityName;
	private String InstallationDistrictName;
	private String InstallationFacilityType;
	private String ServiceProvidrName;
	private String WifiSsid;
	private String DateOfInstallaion;
	private String RoadNameAddress;
	private String LotNumberAddress;
	private String ManagementAgencyName;
	private String ManagementAgencyPhoneNumber;
	private String Latitude;
	private String Longitude;
	private String created;
	
	
	//double형으로 변환시킬 메소드 만들기! get은 인자가 없음! set은 인자가 있어서 그걸로 출력함!
		public double gettodouble1() { 
			double res1 = Double.parseDouble(Latitude);
			return res1;	
		}
		
		public double gettodouble2() {
			double res2 = Double.parseDouble(Longitude);
			return res2;
		}
	
	//getter setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInstallationLocationName() {
		return InstallationLocationName;
	}
	public void setInstallationLocationName(String installationLocationName) {
		InstallationLocationName = installationLocationName;
	}
	public String getInstallationLocationDetails() {
		return InstallationLocationDetails;
	}
	public void setInstallationLocationDetails(String installationLocationDetails) {
		InstallationLocationDetails = installationLocationDetails;
	}
	public String getInstallationCityName() {
		return InstallationCityName;
	}
	public void setInstallationCityName(String installationCityName) {
		InstallationCityName = installationCityName;
	}
	public String getInstallationDistrictName() {
		return InstallationDistrictName;
	}
	public void setInstallationDistrictName(String installationDistrictName) {
		InstallationDistrictName = installationDistrictName;
	}
	public String getInstallationFacilityType() {
		return InstallationFacilityType;
	}
	public void setInstallationFacilityType(String installationFacilityType) {
		InstallationFacilityType = installationFacilityType;
	}
	public String getServiceProvidrName() {
		return ServiceProvidrName;
	}
	public void setServiceProvidrName(String serviceProvidrName) {
		ServiceProvidrName = serviceProvidrName;
	}
	public String getWifiSsid() {
		return WifiSsid;
	}
	public void setWifiSsid(String wifiSsid) {
		WifiSsid = wifiSsid;
	}
	public String getDateOfInstallaion() {
		return DateOfInstallaion;
	}
	public void setDateOfInstallaion(String dateOfInstallaion) {
		DateOfInstallaion = dateOfInstallaion;
	}
	public String getRoadNameAddress() {
		return RoadNameAddress;
	}
	public void setRoadNameAddress(String roadNameAddress) {
		RoadNameAddress = roadNameAddress;
	}
	public String getLotNumberAddress() {
		return LotNumberAddress;
	}
	public void setLotNumberAddress(String lotNumberAddress) {
		LotNumberAddress = lotNumberAddress;
	}
	public String getManagementAgencyName() {
		return ManagementAgencyName;
	}
	public void setManagementAgencyName(String managementAgencyName) {
		ManagementAgencyName = managementAgencyName;
	}
	public String getManagementAgencyPhoneNumber() {
		return ManagementAgencyPhoneNumber;
	}
	public void setManagementAgencyPhoneNumber(String managementAgencyPhoneNumber) {
		ManagementAgencyPhoneNumber = managementAgencyPhoneNumber;
	}
	
	
	public String getLatitude() {
		return Latitude;
	}
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	
	
	
	
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	
}



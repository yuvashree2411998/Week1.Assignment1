package week1.Assignment1;

public class MyMobile {
	String device_name= "MI";
	String module_name= "10pro";
	int battery_Mah = 5000;
	long imei_no = 198765342986L;
	public void makeCall() {
		System.out.println("Dialing you****");
	}
	public void sendMsg() {
	System.out.println("Hitting your notification");
	}
	private void payBills() {
		System.out.println("Account wating for Renewal");
}
	public static void main(String[] args) {
		
		MyMobile obj =new MyMobile();
		obj.makeCall();
		obj.sendMsg();
		obj.payBills();
		
		System.out.println("Device Name:" +obj.device_name);
		System.out.println("Model Name:" + obj.module_name);
		System.out.println("Baterry Capacity:" + obj.battery_Mah + " MAH");
		System.out.println("imei ID: " + obj.imei_no);
		
	}

}

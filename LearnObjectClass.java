package week1.day1;

public class LearnObjectClass {
	float size;
	String shape;
	String IMEI;
	char brandName;
	int resolution;
	byte weight;
	boolean isTouchScreen;
	short costMobile;

	public void makecall() {
		System.out.println("Making Calls");
	}

	public void payMoney() {
		System.out.println("Paying Money");
	}

	public void viewGallery() {
		System.out.println("Viewing Gallery");
	}

	public static void main(String[] args) {
		
		LearnObjectClass samsung = new LearnObjectClass();
		samsung.brandName = 'S';
		samsung.costMobile = 25000;
		samsung.isTouchScreen = true;
		samsung.resolution = 324;
		samsung.IMEI = "1234567898765432";
		samsung.viewGallery();
		samsung.makecall();
		samsung.payMoney();
		System.out.println("Brand Name : " + samsung.brandName);
		System.out.println("Cost Of mobile : " + samsung.costMobile );
		
		System.out.println("*************************************");
		
		LearnObjectClass apple = new LearnObjectClass();
		apple.brandName = 'S';
		apple.costMobile = 25000;
		apple.isTouchScreen = true;
		apple.resolution = 324;
		apple.IMEI = "1234567898765432";
		apple.viewGallery();
		apple.makecall();
		apple.payMoney();
		System.out.println("Brand Name : " + apple.brandName);
		System.out.println("Cost Of mobile : " + apple.costMobile );
	}

}

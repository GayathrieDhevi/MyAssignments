package week1.day1;

public class Mobile {
	public void makeCall() {
		String mobileModel="Motorola";
		float mobileWeight=108.23f;
		System.out.println("Mobile Model : "+ mobileModel);
		System.out.println("Mobile Weight :"+ mobileWeight);
	}
	public void sendMsg() {
		boolean isFullyCharged=true;
		int mobileCost=50000;
		System.out.println("Mobile charged : "+ isFullyCharged);
		System.out.println("Mobile Cost :"+ mobileCost);
	}
	public static void main(String[] args) {
		Mobile motoRola= new Mobile();
		motoRola.makeCall();
		motoRola.sendMsg();
		System.out.println("This is my mobile");
	}

}

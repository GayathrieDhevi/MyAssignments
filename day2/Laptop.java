package week1.day2;

public class Laptop {
	public void switchOn() {
		System.out.println("Switch on the laptop");
	}
	public void openBrowser() {
		System.out.println("Open any browser");
	}
	public void workOnApplications() {
		System.out.println("Work on the applications");
	}
	public void closeBrowser() {
		System.out.println("Close the browser");
	}
	public void lockLaptop() {
		System.out.println("Lock the laptop");
	}
	public static void main(String[] args) {
//ClassName objectName = new className() or constructor();
		Laptop myLap=new Laptop();
		myLap.switchOn();
		myLap.openBrowser();
		myLap.workOnApplications();
		myLap.closeBrowser();
		myLap.lockLaptop();
		
	}
}

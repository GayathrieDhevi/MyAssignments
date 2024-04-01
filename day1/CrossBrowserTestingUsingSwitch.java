package week2.day1;

public class CrossBrowserTestingUsingSwitch {
	public static void main(String[] args) {
		String browserName = "Edge";
		switch (browserName) {
		case "Chrome":
			System.out.println("Chrome Browser executed");
			break;
		case "Edge":
			System.out.println("Edge Browser executed");
			break;
		case "Safari":
			System.out.println("Safari Browser executed");
			break;
		case "FireFox":
			System.out.println("FireFox Browser executed");
			break;
		case "Opera":
			System.out.println("Opera Browser executed");
			break;
		default:
			System.out.println("Its IE");
			break;
		}
	}

}

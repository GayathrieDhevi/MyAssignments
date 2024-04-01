package week2.day1;

public class PrintBiggestNumber {
	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=300;
		
		if(a>b && a>c) {
			System.out.println(a + "a is the biggest number");
		}
		else if(a<b && a>c) {
			System.out.println(b + "b is the biggest number");
		}
		else{
			System.out.println(c + "c is the biggest number");
		}
		
		if(a!=b) {
			System.out.println("Both are not equal");
		}
		else {
			System.out.println("both are equal");
		}
	}

}

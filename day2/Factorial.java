package week2.day2;

public class Factorial {
	public static void main(String[] args) {
		//5*4*3*2*1 120
		int fact = 1;
		for (int i=5;i>0;i--) {
			fact=fact*i;
			//fact=1*5 --> 5
			// ==> fact is assigned with value 5
			// then fact = 5*4 --> 20
			//fact = 20*3 --> 60
			//fact = 60*2 --> 120
			//fact = 120*1 --> 120
			
		}
		System.out.println(fact);
	}

}

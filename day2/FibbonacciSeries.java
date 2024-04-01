package week2.day2;

public class FibbonacciSeries {
	public static void main(String[] args) {
		//series number 0,1,1,2,3,5,8,13,21,....
		int firstNumber=0;
		int secondNumber=1;
		
		//initialize temporary variable for addition or subtraction its 0 and for multiplication or division its 1
		
		int sum=0;
		int len=8;
		
		for(int i=0;i<=len;i++) {
			sum=firstNumber+secondNumber;
			System.out.println(sum);		
			firstNumber=secondNumber; //here the value of second number is assigned to first number
			secondNumber=sum;//here the sum value is assigned to second number 
			
			
		}
	}

}

package week2.day1;

public class LearnArray {
	public static void main(String[] args) {
		int[] number = {10,20,30,40,50};
		//to get size of an array
		int len=number.length;
		System.out.println(len);
		
		//iterate printing array number
		for(int i =0; i<len; i++) {
			System.out.println(number[i]);
		}
		
		//iterate printing array number in reverse order
		for(int i=number.length-1; i>=0; i--) {
			System.out.println(number[i]);
		}
	}

}

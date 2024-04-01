package week2.day2;

import java.util.Arrays;

public class FindMissingNumber {
	public static void main(String[] args) {
		//Initialize an Array
		int[] num= {1,8,5,2,7,3,4};
		//Missing number--> 6
		Arrays.sort(num);
		//1,2,3,4,5,7,8
		
		//Iterate the values from num
		for (int i=0; i<num.length; i++) {
			int j=i+1;
			if(num[i]!=j) {
				System.out.println(j);
				break;
			}
		}
		
	}

}

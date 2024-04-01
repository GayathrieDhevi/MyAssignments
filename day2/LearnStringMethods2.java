package week2.day2;

public class LearnStringMethods2 {
	public static void main(String[] args) {
		
			//get count of given string
		String text="Testleaf";
		int length= text.length();
		System.out.println(length);
		
		//print all character in capital letters
		
		String obj="Testleaf";
		String uppercase = obj.toUpperCase();
		System.out.println(uppercase);
		
		//print all character in small letters
		
				String obj2="Testleaf";
				String lowercase = obj2.toLowerCase();
				System.out.println(lowercase);
				
		//string reverse
								
				String obj3="Testleaf";
				//t,e,s,t,l,e,a,f
				//convert the string into character
				char[] charArray = obj3.toCharArray();
				//iterate the values from charArray
				for (int i=0;i<charArray.length;i++) {
				System.out.println(charArray[i]);	
		}
				
	}
	
}
		




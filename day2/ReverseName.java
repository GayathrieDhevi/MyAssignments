package week2.day2;

public class ReverseName {
	public static void main(String[] args) {
		
				//string reverse
								
				String name="Gayathrie";
				System.out.println("My name is " +name);
				//G,a,y,a,t,h,r,i,e
				//convert the string into character
				char[] charArray = name.toCharArray();
				
				int len=name.length();
				System.out.println("Length of string is " +len);
				
				//iterate the values from charArray and reverse it
				for (int i=len-1;i>=0;i--) {
				System.out.print(charArray[i]);	
		}
				
	}
	
}
		




package week2.day2;

public class Palindrome {
	
	public static void main(String[] args) {
		//initialize string
		String text="malayalam123";
		//initialize empty sting
		String reverse="";
		
		//convert string into charArray
		
		char[] eachCharacter=text.toCharArray();
		//length is 9 but will store the index values 0 to 8
		        //eachCharacter[0]=m;
				//eachCharacter[1]=a;
				//eachCharacter[2]=l;
				//eachCharacter[3]=a;
				//eachCharacter[4]=y;
				//eachCharacter[5]=a;
				//eachCharacter[6]=l;
				//eachCharacter[7]=a;
				//eachCharacter[8]=m;
		
		//iterate that character from eachCharacter
		for(int i=eachCharacter.length-1;i>=0;i--) {
			reverse=reverse+eachCharacter[i];
	}
            System.out.println(reverse);
            
            if(reverse.equals(text)){
            	System.out.println("The given string is palindrome");
            }
            else {
            	System.out.println("Not a palidrome");
            }
		}

}

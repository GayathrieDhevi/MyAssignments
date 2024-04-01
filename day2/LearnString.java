package week2.day2;

public class LearnString {
	public static void main(String[] args) {
		String object="Test";
		//System.out.println(object);
		object="Leaf";
		System.out.println(object);
		
		//== is used to compare memory address
		//.equal is used to compare the content of this string
		
	String text1="testleaf";
	String text2="testleaf";
	
	if (text1==text2) {
		System.out.println("Both are same");
	}
	else {
		System.out.println("Both are not same");
	}
		
         String obj1=new String ("Testleaf");
		 String obj2=new String ("TestLeaf");
		 
			if (obj1==obj2) {
				System.out.println("Both are same");
			}
			else {
				System.out.println("Both are not same");
			}	 
		 if(obj1.equals(obj2))
		 {
				System.out.println(".equal Both are same");
			}
			else {
				System.out.println(".equal Both are not same");
			}	 
}
}
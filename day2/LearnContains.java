package week2.day2;

public class LearnContains {
	
	public static void main(String[] args) {
		String text="Leaftaps - Testleaf Atomation Platform";
		String title = "Leaftapss";
		
		if(text.contains(title)) {
			System.out.println("Partial match found");
		}else {
			System.out.println("No match found");
		}
	}

}

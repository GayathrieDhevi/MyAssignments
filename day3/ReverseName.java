package week2.day3;

public class ReverseName {
	public static void main(String[] args) {
		
				//Initialize
								
				String text="I am a software tester";
			//REverse Even words ==> i ma a erawtfos tester
				
				String[] split = text.split(" ");
						
				
				//iterate the values from charArray and reverse it
				
				for (int i=0;i<split.length;i++){
					if(i%2!=0) {
						//System.out.println(split[i]);
						//converted string into charArray
						char[] charArray = split[i].toCharArray();
						for(int j=charArray.length-1;j>=0;j--) {
						System.out.print(charArray[j]);
								}
					}
								else {
									System.out.print(" ");
									System.out.print(split[i]+" ");
								}
					}
					
		}
				
	}
	

		




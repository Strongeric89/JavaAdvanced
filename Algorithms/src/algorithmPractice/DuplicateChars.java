package algorithmPractice;

public class DuplicateChars {
	public static void main(String[] args) {
		
		DuplicateChars a = new DuplicateChars();
		
		String one = "anaconda";
		String two = "great";
		
		System.out.println(one + " has duplicates: " + a.hasDuplicateChars(one));
		System.out.println(two + " has duplicates: " + a.hasDuplicateChars(two));
	}
	
	public boolean hasDuplicateChars(String s) {
		
		//On2
		for(int i = 0; i <s.length(); i++) {
			for(int j = i +1; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					System.out.println("duplicate letter: " + s.charAt(i));
					return true;
				}
				
			}
		}
		
		return false;
		
		
	}
}

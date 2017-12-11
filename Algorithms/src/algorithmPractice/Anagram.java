package algorithmPractice;


public class Anagram {
	public static void main(String[] args) {
	
		String word1 = "Motherinlaw";
		String word2 = "WomanHitler";
		
		System.out.println("words are an anagram: " + anagramChecker(word1,word2));
		
		
	}
	public static boolean anagramChecker(String s1, String s2) {
		
		
		
		//if they are different length they are defo not an anagram
		if(s1.length() != s2.length()) {
			return false;

		}
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		
		s1 = new String (sort(s1));
		s2 = new String (sort(s2));
		
		System.out.println(s1);
		System.out.println(s2);
		if(s1.equals(s2)) {
			return true;
		}else {
			return false;
		}
		

	}
	
	public static char[] sort(String s1) {
		//sort the string
				char letters[] = s1.toCharArray();
				for(int j = 1; j< letters.length;j++) {
					char key = letters[j];
					int i = j - 1;
					
					while((i> -1) && (letters[i] > key)) {
						letters[i + 1] = letters[i];
						i --;
					}
					letters[i+1] = key;
				}
				
				return letters; 
	}

}

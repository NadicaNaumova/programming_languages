public class string1 {

	public static void main(String[] args) {
		
		
		        String originalWord = "Computer";

		        
		        System.out.println("Original Form: " + originalWord);

		        
		        System.out.println("Length of the Word: " + originalWord.length());

		        
		        char firstLetter = originalWord.charAt(0);
		        char middleLetter = originalWord.charAt(originalWord.length() / 2);
		        char lastLetter = originalWord.charAt(originalWord.length() - 1);
		        System.out.println("First Letter: " + firstLetter);
		        System.out.println("Middle Letter: " + middleLetter);
		        System.out.println("Last Letter: " + lastLetter);

		        
		        boolean startsWithCom = originalWord.startsWith("Com");
		        System.out.println("Starts with 'Com': " + startsWithCom);

		      
		        boolean endsWithIon = originalWord.endsWith("ion");
		        System.out.println("Ends with 'ion': " + endsWithIon);

		      
		        String firstTwoLetters = originalWord.substring(0, 2);
		        System.out.println("First Two Letters: " + firstTwoLetters);

		        
		        String swappedWord = originalWord.replace('e', 'o');
		        System.out.println("Word with 'e' swapped to 'o': " + swappedWord);

		      
		        String replacedWord = originalWord.replace("Compu", "Calcula");
		        System.out.println("Word with 'Compu' replaced by 'Calcula': " + replacedWord);
		    }
		
	}

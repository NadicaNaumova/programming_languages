  public class StringAnalysis {
    public static void main(String[] args) {
        String inputString = "Hello, World"; 
        
        char firstCharacter = inputString.charAt(0);

        char lastCharacter = inputString.charAt(inputString.length() - 1);

       
        char middleCharacter;
        int length = inputString.length();
        if (length % 2 == 1) {
            middleCharacter = inputString.charAt(length / 2);
        } else {
            middleCharacter = inputString.charAt(length / 2 - 1);
        }

       
        int sumOfCharacters = firstCharacter + lastCharacter + middleCharacter;

       
        char maxCharacter = firstCharacter;
        if (lastCharacter > maxCharacter) {
            maxCharacter = lastCharacter;
        }
        if (middleCharacter > maxCharacter) {
            maxCharacter = middleCharacter;
        }

      
        System.out.println("First Character: " + firstCharacter + " (Position: 0)");
        System.out.println("Last Character: " + lastCharacter + " (Position: " + (inputString.length() - 1) + ")");
        System.out.println("Middle Character: " + middleCharacter + " (Position: " + (length % 2 == 1 ? length / 2 : length / 2 - 1) + ")");
        System.out.println("Sum of Characters: " + sumOfCharacters);
        System.out.println("Character with the Biggest Value (Code): " + maxCharacter);
    }
}

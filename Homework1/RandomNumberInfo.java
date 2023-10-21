mport java.util.Random;

public class RandomNumberInfo {
    public static void main(String[] args) {
        Random rand = new Random();
        double randomNumber = rand.nextDouble() * 100; 

        
        int integerPart = (int) randomNumber;
        double decimalPart = randomNumber - integerPart;

        
        char charFromCode = (char) integerPart;

        
        System.out.println("Random Decimal Number: " + String.format("%.2f", randomNumber));
        System.out.println("Integer Part: " + integerPart);
        System.out.println("Decimal Part: " + String.format("%.2f", decimalPart));
        System.out.println("Character from ASCII Code: " + charFromCode);
    }
}

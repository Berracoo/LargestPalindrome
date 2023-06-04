

public class Main {
    public static void main(String[] args) {
        int largestPalindrome = 0;
        int firstNumber = 0;
        int secondNumber = 0;
        
        for(int i = 999; i>= 100; i--){
            // generating all possible products of two 3-digit numbers
            for(int j = i; j >= 100; j--){
                int product = i * j;
                // if the method returns true and product is bigger that the largest palindrome 
                // largest palindrome equals to product
                if(isPalindrome(product) && product> largestPalindrome){
                    largestPalindrome = product;
                    firstNumber = i;
                    secondNumber = j;
                }
                
            }
        }
        System.out.println("Largest Palindrome Number : " + largestPalindrome);
        System.out.println("First Number : " + firstNumber +"\n" + "Second Number : " + secondNumber);

    }
    public static boolean isPalindrome(int number){
        int reversedNumber = 0;
        int originalNumber = number;
        // reversing the original number in order to compare with the original one.
        while(number != 0){
            // this gives us the rightmost digit
            int digit = number % 10;
            // an then we add it to the beginning
            reversedNumber = reversedNumber * 10 + digit;
            // and by dividing with then the rightmost digit disappears
            number /= 10;
        }
        // the loop will continiue until the number becomes zero.
        return originalNumber == reversedNumber;

    }
}



public class Main {
    public static void main(String[] args) {
        int largestPalindrome = 0;
        int firstNumber = 0;
        int secondNumber = 0;
        
        for(int i = 999; i>= 100; i--){
            for(int j = i; j >= 100; j--){
                int product = i * j;
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
        while(number != 0){
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;

    }
}

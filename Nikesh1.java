import java.util.Scanner;

public class Nikesh1 {

    public static int sumDigits(int n) {
        int sumOfDigits = 0; // 3
        while (n > 0) {
            int lastDigit = n % 10; // //3 --1
            sumOfDigits += lastDigit; // 3 --4
            n /= 10; // 1.1 --0.0
        }
        return sumOfDigits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int digits = sc.nextInt(); // 13
        System.out.println("The sum is " + sumDigits(digits));
    }

}

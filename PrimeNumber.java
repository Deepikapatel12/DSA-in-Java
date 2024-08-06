
import java.util.Scanner;
// find the first 10 prime numbers
public class PrimeNumber {
    public static void main(String[] args) {
        //WAP to check whether the given number is prime number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = scanner.nextInt();
        int count = 0;
        // prime -> those numbers which are divisible by itself and 1
        if (number > 1) {
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    count++;

                    System.out.println(i);
                    //break statement
                    break;
                }
                System.out.println("i = " + i);
            }
            // check count if 2 prime, more than not prime
            if (count == 0) {
                System.out.println("prime number");
            } else {
                System.out.println("Not a prime number");

            }
        } else {
            System.out.println(" Number 1 is neither prime nor composite");
        }

    }
}

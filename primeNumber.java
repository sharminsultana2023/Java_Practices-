import java.util.Scanner;

public class primeNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your number: ");
            int n = scanner.nextInt();
            System.out.println("Prime number between 2 - " + n + ":");

            for(int i = 2; i <= n; ++i)
            {
                boolean primeNum = true;

                for(int j = 2; j <= i / 2; ++j) {
                    if (i % j == 0) {
                        primeNum = false;
                        break;
                    }
                }

                if (primeNum) {
                    System.out.println(i);
                }
            }
        }

}
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] arg)
    {
        //int number, sum;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int sum;
        int num=scanner.nextInt();
        for(sum=0; num!=0; num=num/10)
        {
            sum = sum + num % 10;
        }

        System.out.println("Sum of digits: "+sum);
    }
}

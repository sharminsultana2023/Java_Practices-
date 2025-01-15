import java.util.Scanner;

public class EncryptWord {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input Your Word");
        String word = scanner.next();
        char [] chars = word.toCharArray();
        for(char ch : chars){
            ch+=5;
            System.out.print(ch);
        }

    }
}

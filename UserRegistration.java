import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) throws IOException {
        JSONObject userReg=new JSONObject();
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter your name");
        userReg.put("Full name", scanner.nextLine());

        System.out.println("enter your email");
        userReg.put("Email:", scanner.nextLine());

        System.out.println("enter your password");
        userReg.put("Password:", scanner.nextLine());

        System.out.println("enter your address");
        userReg.put("Address:", scanner.nextLine());

        System.out.println("enter your mobile no");
        userReg.put("Mobile no:", scanner.nextLine());

        System.out.println(userReg);
        FileWriter file = new FileWriter("./src/main/resources/UserReg.json");
        file.write(userReg.toJSONString());
        file.flush();

    }
}

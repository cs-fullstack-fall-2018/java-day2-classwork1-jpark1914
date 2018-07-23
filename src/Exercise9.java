import java.awt.*;
import java.util.Scanner;
public class Exercise9 {

    public static void main(String[] args){
        System.out.println("What is your password?");
        Scanner scanIn = new Scanner(System.in);
        String password = scanIn.nextLine();
        System.out.println("Please confirm password");
        String confirmPass = scanIn.nextLine();
        while(!confirmPass.equals(password)){
            System.out.println("Incorrect");
            System.out.println("Enter password");
             password = scanIn.nextLine();
            System.out.println("Please confirm password");
             confirmPass = scanIn.nextLine();
             if(confirmPass.equals(password)){
                 System.out.println("That's Correct");
             }else{
                 continue;
             }

        }

    }
}

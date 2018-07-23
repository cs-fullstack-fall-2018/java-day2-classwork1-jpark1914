import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
	System.out.println("How awesome is Kenn and Kevin?");
	Scanner scanIn = new Scanner(System.in);
	String verdict = scanIn.nextLine().toLowerCase();
	while(!verdict.equals("very awesome")){
	    System.out.println("Are you sure, they aren't 'Very Awesome'? ");
	    verdict = scanIn.nextLine().toLowerCase();
    }
    }
}

package emali1;
import java.util.Scanner;
import java.util.regex.*;

public class EmailChek1 {

    private boolean check;
    private String email;
    private static Scanner SCANNER = new Scanner(System.in);

    public void checkemail() {
        System.out.println("Enter email : ");
        email = SCANNER.nextLine();
        check = Pattern.compile("^[a-z0-9]+@[a-z]*$").matcher(email).matches();
        if (!check) {
            System.out.println("Invalid!! Email");
            checkemail();
        } else
            System.out.println("This is Valid Email");
    }


    public static void main(String[] args) {
        EmailChek1 em = new EmailChek1();
        em.checkemail();

    }
}

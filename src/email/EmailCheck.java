package email;
import java.util.Scanner;
import java.util.regex.*;

public class EmailCheck {
    private boolean check;
    private String email;
    private static Scanner SCANNER = new Scanner(System.in);

    public void checkemail() {
        System.out.println("Enter email : ");
        email = SCANNER.nextLine();
        check = Pattern.compile("^[a-z0-9]+@[a-z]*$").matcher(email).matches();
        if (!check) {
            System.out.println("Invalid!! Email");
        } else
            System.out.println("This is Valid Email");
    }


    public static void main(String[] args) {
        EmailCheck em = new EmailCheck();
        em.checkemail();

    }
}
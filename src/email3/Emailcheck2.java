package email3;
import java.util.Scanner;
import java.util.regex.*;

public class Emailcheck2 {
    private boolean check;
    private String email;
    private static Scanner SCANNER = new Scanner(System.in);

    public void checkemail() {
        System.out.println("Enter email : ");
        email = SCANNER.nextLine();
        check = Pattern.compile("^[a-z-\\+]+[\\.[a-z]]+@[a-z]*[\\.[a-z \\.[a-z]]]*").matcher(email).matches();
        if (!check) {
            System.out.println("Invalid!! Email");
        } else
            System.out.println("This is Valid Email");
    }


    public static void main(String[] args) {
        Emailcheck2 em = new Emailcheck2();
        em.checkemail();

    }
}






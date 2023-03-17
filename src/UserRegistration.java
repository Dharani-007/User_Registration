import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("User registration problem");
        Scanner sc = new Scanner(System.in);
        UserRegistrationInput userRegistration = new UserRegistrationInput();

        System.out.println("Enter first name ");
        String firstName = sc.next();
        if (userRegistration.isFirstNameValid(firstName))
            System.out.println("Valid first name");
        else
            System.out.println("Invalid first name");

        System.out.println("Enter last name ");
        String lastName = sc.next();
        if (userRegistration.isLastNameValid(firstName))
            System.out.println("Valid last name");
        else
            System.out.println("Invalid last name");
    }
}
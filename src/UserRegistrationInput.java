import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationInput {
    private Pattern pattern;
    private Matcher matcher;

    public boolean isFirstNameValid(String firstName){
        String regex = "[A-Z][a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
    public boolean isLastNameValid(String lastName) {
        String regex = "[A-Z][a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
    public boolean isEmailValid(String email) {
        String regex = "[a-z0-9.]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})*";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}

package emirates;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

    private void validateEmail(String email) {

        String regex = "[A-Za-z0-9_/.]+[@][gmail]+[/.][a-z]{2,3}";  //    \ escape

        Pattern pattern = Pattern.compile(regex);
        Matcher isMatched = pattern.matcher(email);
        boolean status = isMatched.matches();
        System.err.println(status);
    }

    public static void main(String[] args) {
        EmailValidation validation = new EmailValidation();
        validation.validateEmail("qaAZ9@gmail.com");
    }
}

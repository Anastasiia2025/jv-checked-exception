package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (password == null || !password.equals(repeatPassword) || password.length() < 10) {
            throw new PasswordValidationException("Wrong password");
        }

        //write your code here
    }
}

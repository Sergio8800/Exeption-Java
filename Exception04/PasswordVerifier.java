package Exception04;

import java.util.Scanner;

public class PasswordVerifier {
    public void verifierPassword(String pass) throws ExceptionPassword{
        String s = pass;
        String pat = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9@#$%]).{8,}";
        if (!s.matches(pat)) {
            throw new ExceptionPassword("Пароль НЕнадежный!");

        }
        else {
            System.out.println("Пароль надежный");
        }
    }
}

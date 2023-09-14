package Exception04;
//Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает строку пароля и проверяет его
// на соответствие следующим правилам:
//
//        Пароль должен быть не менее 8 символов.
//        Пароль должен содержать хотя бы одну цифру.
//        Пароль должен содержать хотя бы одну заглавную букву.
//        Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ExceptionPassword {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input new password:");
        String s = scanner.next();

        PasswordVerifier pass = new PasswordVerifier();
        pass.verifierPassword(s);
    }
}

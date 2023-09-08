package Exeption;

import java.util.Scanner;

public class HandingExeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("число1 - ");
        double num1 = scanner.nextDouble();
        System.out.println("число2 - ");
        double num2 = scanner.nextDouble();
        if (num2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        System.out.println(num1/num2);
    }
}
class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}


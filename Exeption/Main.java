package Exeption;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int num = scanner.nextInt();
            if (num<=0){
                throw new InvalidNumberException("!");
            }
            System.out.println( "Число корректно");
        } catch (InvalidNumberException e) {
            System.out.println("Некорректное число" + e.getMessage());
        }


    }
    public static void throwInvalidNumber() throws InvalidNumberException{
        throw new InvalidNumberException("Некорректное число");
    }
}
class InvalidNumberException extends RuntimeException{
    public InvalidNumberException(String message){
        super(message);
    }
}


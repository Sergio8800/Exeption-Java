import java.util.ArrayList;
import java.util.Scanner;

public class Mail {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
    }

    class Answer {
        public static void arrayOutOfBoundsException() {
            // Напишите свое решение ниже
            try {
                int[] array = new int[12];
                for (int i = 0; i < array.length; i++) {
                    array[i] = (int) Math.round((Math.random() * 30) - 15);

                }System.out.println(array[12]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Выход за пределы массива");
            }
        }

        public static void divisionByZero() {
            // Напишите свое решение ниже
            try {
             int a  = (int) Math.round((Math.random() * 30) - 15);
             int b = 0 ;
             int c;
             c = a/b;
            }
            catch (ArithmeticException e){
                System.out.println("Деление на ноль");
            }
        }

        public static void numberFormatException() {
            // Напишите свое решение ниже
            String str1 = "12613r";
            try {
                Integer i2 = Integer.valueOf(str1);
                System.out.println(i2);
            }
            catch (NumberFormatException e){
                System.out.println("Ошибка преобразования строки в число");
            }

        }
    }

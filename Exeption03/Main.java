package Exeption03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberOutOfRangeException, DivisionByZeroException, NumberSumException {


        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1>100){
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        if (num2<0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
        if (num3 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        if ((num2+num1)<10){
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
        System.out.println("Проверка пройдена успешно");
    }
}

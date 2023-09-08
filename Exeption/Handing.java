package Exeption;

import java.util.Scanner;

public class Handing {
    public static void main(String[] args) throws DivisionByZeroException2 {
        Scanner scanner = new Scanner(System.in);
        System.out.println("число1 - ");
        double num1 = scanner.nextDouble();
        System.out.println("число2 - ");
        double num2 = scanner.nextDouble();
        Calcul calcul = new Calcul();
        double result = calcul.divide(num1,num2);
        System.out.println(result);
    }
  }
class Calcul{
    public double divide(double num1, double num2) throws DivisionByZeroException2{
        if (num2 ==0){
            throw new DivisionByZeroException2("Деление на ноль недопустимо!",num1,num2);
        }
        return num1/num2;
    }
    }

class DivisionByZeroException2  extends Exception{
    private double num1;
    private double num2;
    public DivisionByZeroException2 (String message, double num1, double num2){
        super(message);
        this.num2=num2;
        this.num1=num1;
    }
    public double getNum1(){
        return num1;
    }
    public double getNum2(){
        return num2;
    }
    public String getErrorDetails(){
        return "num1 = " + num1 + ", num2 = " + num2;
    }
}





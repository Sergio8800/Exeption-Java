package Exception04Calcul;

public class MathOperations {
    public double divisionByZero(double a, double b) throws ExceptionCalc {

        double c;
        if (b == 0){
            throw new ExceptionCalc("Деление на ноль!");
        }
        c = a/b;
        return c;
    }
    public double add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
}

package Exception04Calcul;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws ExceptionCalc {
        MathOperations calc = new MathOperations();
        calc.add(8,9);
        calc.divisionByZero(9,0);
    }
}

package homework4;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

//Даны переменные x и n вычислить x^n.

public class XtoN_5t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number(x)");
        int x = sc.nextInt();
        System.out.println("Enter the number(n)");
        int n = sc.nextInt();

        BigDecimal result = new BigDecimal(1);
        if (n == 0) {
            System.out.println("x^n =  " + result); // если 0 степень, то возвращаем единицу
        } else {
            if (n >= 0) {               // если степень больше нуля
                for (int i = 1; i <= n; i++) {
                    result = result.multiply(BigDecimal.valueOf(x), new MathContext(4, RoundingMode.HALF_UP));
                }

            } else {                    //если степень меньше нуля
                for (int i = 1; i <= Math.abs(n); i++) {
                    result = result.divide(BigDecimal.valueOf(x), new MathContext(4, RoundingMode.HALF_UP));
                }
            }
            System.out.println("x^n = " + result);
        }
    }
}
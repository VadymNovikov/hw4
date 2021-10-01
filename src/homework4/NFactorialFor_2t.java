package homework4;

import java.util.Scanner;
//Дано число n при помощи цикла for посчитать факториал n!
public class NFactorialFor_2t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which we will be looking for the factorial:");
        int n = sc.nextInt();

        if (n >= 0) {
            int nFactorial = 1;
            for (int i = 1; i <= n; i++) {
                nFactorial *= i;
            }
            System.out.println("Factorial of " + n + " is " + nFactorial);
        }
    }
}
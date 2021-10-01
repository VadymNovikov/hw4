package homework4;

import java.util.Scanner;
//Необходимо вывести на экран таблицу умножения на Х: (любое число вводимое из консоли)
public class MultiplicationTableOnX_7t {
    public static void main(String[] args) {
        //read data source
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = scanner.nextInt();
        //processing
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "x" + x + "=" + (i * x) + "\t"); //display result
        }
    }
}
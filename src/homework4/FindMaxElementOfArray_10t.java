package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//В массиве из задания 9. найти наибольший элемент.
public class FindMaxElementOfArray_10t {

    public static void main(String[] args) {
        //Fill Up
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n = scanner.nextInt();
        int[] array = new int[n];
        //заполняем массив
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int r = rand.nextInt(1000);
            array[i] = r;
        }
        System.out.println(Arrays.toString(array));
        //processing
        //ищем наибольший элемент массива
        int maxvalue = array[0];
        for (int i : array) {
            if (i > maxvalue) {
                maxvalue = i;
            }
        }
        //display result
        System.out.println("Max element is " + maxvalue); //Проверяем максимальный элемент
    }
}
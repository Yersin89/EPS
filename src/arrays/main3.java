package arrays;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main3 {
    public static void main(String[] args){
        ArrayList <Integer> array = new ArrayList <Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("ВВедите число: ");
        int num = scan.nextInt();
        Random rand = new Random();
        Integer i=0;
        while (i < num)
        {
            array.add(rand.nextInt(60)-30);
            i++;
        }
        // задача 4
        int max = array.get(0);
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        // задача 5
        int min = array.get(0);
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        //задача 6
        double average = 0;
        for (int number : array) {
            average = average + number;
        }
        System.out.println(array);
        System.out.println(max);
        System.out.println(min);
        System.out.println(average / num );

    }
}

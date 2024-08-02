package arrays;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 задача
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> array = new ArrayList <Integer>();
        int i = 0;
        while (i < 20)
        {
            array.add(i);
            i++;
        }
        int result = 0;
        for(Integer number : array)
        {
            if (number % 2 == 0){
                result = result + number;
            }
        }
        System.out.println(array);
        System.out.println(result);

        // 2 задача
        ArrayList <Integer> array1 = new ArrayList <Integer>();
        ArrayList <Integer> aray1Result = new ArrayList <Integer>();
        System.out.println("ВВедите число: ");
        int num = scan.nextInt();
        Random rand = new Random();
        i=0;
        while (i < num)
        {
            array1.add(rand.nextInt(60)-30);
            i++;
        }
        int num1 = 0;
        System.out.println(array1);
        for(int number1 : array1)
        {
            if (number1 < 0){
                aray1Result.add(number1);
                num1++;
            }
        }
        System.out.println(aray1Result + " " + num1);
    }
}

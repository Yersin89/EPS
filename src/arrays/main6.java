package arrays;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main6 {
    public static void main(String[] args) {
            ArrayList<Integer> array = new ArrayList<Integer>();
            Scanner scan = new Scanner(System.in);
            System.out.println("ВВедите число: ");
            Integer num = scan.nextInt();
            Random rand = new Random();
            Integer i = 0;
            while (i < num) {
                array.add(rand.nextInt(60) - 30);
                i++;
            }
            // задача 9
            Integer max = array.get(0);
            Integer maxIndex = 0;
            for (int j = 0; j < array.size(); j++) {
                Integer number = array.get(j);
                if (number > max) {
                    max = number;
                    maxIndex = j;
                }
            }
            System.out.println(array);
            System.out.println(max);
            System.out.println(maxIndex);
        }
}

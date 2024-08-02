package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class main7 {
    public static void main(String[] args) {
        // 1 задача
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        int i = 1;
        while (i < 8) {
            array.add(i);
            i++;
        }
        int result = 1;
        for (Integer number : array) {
            if (number % 2 == 0) {
                result = result * number;
            }
        }
        System.out.println(array);
        System.out.println(result);
    }
}

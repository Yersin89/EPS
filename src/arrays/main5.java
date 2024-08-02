package arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> array = new ArrayList <Integer>();
        System.out.println("ВВедите число: ");
        int num = scan.nextInt();
        Random rand = new Random();
        Integer i = 0;
        while (i < num)
        {
            array.add(rand.nextInt(60)-30);
            i++;
        }
        int result = 0;
        for(Integer number : array)
        {
            if (number % 3 == 0){
                result = result + number;
            }
        }
        System.out.println(array);
        System.out.println(result);
    }
}
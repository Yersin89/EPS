package arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ВВедите число N: ");
        int N = scan.nextInt();
        ArrayList<Integer> array = new ArrayList <Integer>();
        Random rand = new Random();
        Integer i = 0;
        while (i < N)
        {
            array.add(rand.nextInt(60)-30);
            i++;
        }
        Integer result = 0;
        for(int number : array)
        {
            if (number < 7){
                result = result + number;
            }
        }
        System.out.println(array);
        System.out.println(result);
}
}

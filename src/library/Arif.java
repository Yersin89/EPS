package library;

import java.util.Scanner;


public class Arif {
    public static void main(String[] args) {
        System.out.println();
        Scanner scan = new Scanner(System.in);

        System.out.println("ВВедите переменную T: ");
        double t = scan.nextInt();
        System.out.println("ВВедите переменную L: ");
        double l = scan.nextInt();
        double r = 3 * Math.pow(t,2) + 3 * Math.pow(l,5) + 4.9;
        System.out.println("R="+r);
    }
}

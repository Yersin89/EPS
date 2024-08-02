package Auto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AutoMobile BMW = new executive("BMW", 140);

        BMW.information();
        System.out.println("Нажмите 1 чтобы обновить автомобиль");
        Integer i;
        i = scan.nextInt();
        if (i == 1)
        {
            BMW.update();
            BMW.information();
        }
        else {}
    }
}

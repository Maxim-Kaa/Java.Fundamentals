import java.util.Random;
import java.util.Scanner;

public class RandomInt {
    public static void main(String[] args) {
        Random x = new Random();
        int n;
        int[] numbs;
        Scanner in = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            n = in.nextInt();
            numbs = new int [n];
            for (int i=0;i<numbs.length;i++) numbs[i] = x.nextInt();
            for (int i: numbs) System.out.println( i );// С переходом на другую строку
            for (int i: numbs) System.out.print( i + " "); //Без перехода на новую строку
    }
}

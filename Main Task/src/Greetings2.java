import java.util.Scanner;

public class Greetings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свое имя");
        String name = sc.nextLine();
        System.out.println("Приветствую тебя о великий и ужасный " + name + "!");
    }
}

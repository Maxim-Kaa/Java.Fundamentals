import javax.swing.*;

public class Greetings {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Введите свое имя");
        JOptionPane.showMessageDialog(null,"Привет " + name + "!");
    }
}

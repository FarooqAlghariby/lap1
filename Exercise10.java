
import javax.swing.JOptionPane;
import java.sql.SQLOutput;

public class Exercise10 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("what is your name ? ");
        System.out.println(name);
        String job = JOptionPane.showInputDialog("what would you like to do  "+name+"?");
        System.out.println(job);
    }
}


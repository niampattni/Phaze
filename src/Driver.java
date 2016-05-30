import javax.swing.*;
import java.awt.*;
public class Driver extends JFrame {
  
  public Driver() {
    super("Game Window");
    setSize(1200, 900);
    setVisible(true);
    setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setContentPane(new MainMenu());
    add(new MainMenu());
  }
  
  public static void main(String[] args) {
    new Driver();
  }
  
}
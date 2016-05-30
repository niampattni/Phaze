import javax.swing.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;
public class MainMenu extends JPanel {
  
  public MainMenu() {
    BufferedImage bImg;
    JLabel bg;
    try {
      bImg = ImageIO.read(new File("MainMenuBG.png"));
      bg = new JLabel(new ImageIcon(bImg));
      add(bg);
    } catch (IOException e) {}
  }
  
}
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
//test github sync
public class LevelSelect extends JPanel {
  
  BufferedImage bImg;
  
  public LevelSelect() {
    JLabel bg;
    try {
      bImg = ImageIO.read(this.getClass().getResource("TestBG.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    bg = new JLabel(new ImageIcon(bImg));
    add(bg);
  }
  
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(bImg, 0, 0, this);
  }
  
}
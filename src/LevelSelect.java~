import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;
public class LevelSelect extends JPanel {
  
  BufferedImage bImg;
  
  public LevelSelect() {
    JLabel bg;
    try {
      bImg = ImageIO.read(this.getClass().getResource("LevelSelectBG.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    bg = new JLabel(new ImageIcon(bImg));
    add(bg);
    bg.addMouseListener(listener);
  }
  
  MouseListener listener = new MouseListener() {
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {
      int x = e.getX();
      int y = e.getY();
      if (x >= 540 && x <= 746 && y >= 116 && y <= 226) {
        System.out.println("Level 1");
        Driver.changeScreens("LevelOne");
      } else if (x >= 843 && x <= 1011 && y >= 112 && y <= 201) {
        System.out.println("Level 2");
        Driver.changeScreens("LevelTwo");
      } else if (x >= 208 && x <= 350 && y >= 121 && y <= 197) {
        System.out.println("Level 3");
        Driver.changeScreens("LevelThree");
      }
    }
  };
  
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(bImg, 0, 0, this);
  }
  
}
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import java.util.*;
public class LevelOne extends JPanel {
  BufferedImage blankImage, colourImage, bImg;
  JLabel blank, colour, bg;
  Picture pic;
  
  public LevelOne() {
    try {
      bImg = ImageIO.read(this.getClass().getResource("TestBG.png"));
      blankImage = ImageIO.read(this.getClass().getResource("TeddyBear.png"));
      colourImage = ImageIO.read(this.getClass().getResource("TeddyBearC.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    pic = new Picture(blankImage);
    pic.explore();
    revalidate();
    repaint();
  }
  
  private void updateScreen() {
    revalidate();
    repaint();
  }
  
  MouseListener listener = new MouseListener() {
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
  };
  
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(bImg, 0, 0, this);
  }
  
}
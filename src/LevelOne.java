import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
public class LevelOne extends Game {
  
  BufferedImage bImg;
  int x = 0, y = 0;
  
  public LevelOne() {
    JLabel bg;
    try {
      bImg = ImageIO.read(this.getClass().getResource("TestBG.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    bg = new JLabel(new ImageIcon(bImg));
    JLabel blank;
    bg.addMouseListener(bgListener);
    while (!win) {
      loadNextImages();
      blank = new JLabel(new ImageIcon(blankImage));
      blank.addMouseListener(listener);
      while (!checkComplete()) {
        colour(Game.RED, x, y);
      }
    }
  }
  
  MouseListener listener = new MouseListener() {
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {
      x = e.getX();
      y = e.getY();
    }
  };
  
  MouseListener bgListener = new MouseListener() {
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {
      System.out.println("BG Works");
    }
  };
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(bImg, 0, 0, this);
    g.drawImage(blankImage, 200, 100, this);
    g.drawImage(colourImage, 500, 100, this);
  }
  
}
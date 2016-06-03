import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
public class LevelOne extends JPanel {
  
  Game game = new Game();
  BufferedImage blankImage, colourImage, bImg;
  JLabel blank, colour, bg;
  int x, y, bgx, bgy;
  
  public LevelOne() {
    setLayout(null);
    try {
      bImg = ImageIO.read(this.getClass().getResource("TestBG.png"));
      blankImage = ImageIO.read(this.getClass().getResource("TeddyBear.png"));
      colourImage = ImageIO.read(this.getClass().getResource("TeddyBearC.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    bg = new JLabel(new ImageIcon(bImg));
    blank = new JLabel(new ImageIcon(blankImage));
    colour = new JLabel(new ImageIcon(colourImage));
    add(bg);
    add(blank);
    add(colour);
    blank.setLocation(300, 100);
    colour.setLocation(700, 100);
    revalidate();
    repaint();
    bg.addMouseListener(bgListener);
    blank.addMouseListener(listener);
  }
  
  MouseListener bgListener = new MouseListener() {
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {
      bgx = e.getX();
      bgy = e.getY();
      System.out.println("BG CLick");
    }
  };
  
  MouseListener listener = new MouseListener() {
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {
      x = e.getX();
      y = e.getY();
      System.out.println("Image Click");
    }
  };
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(bImg, 0, 0, this);
    g.drawImage(blankImage, 300, 100, this);
    g.drawImage(colourImage, 700, 100, this);
  }
  
}
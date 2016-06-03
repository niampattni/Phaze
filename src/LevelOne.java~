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
  Pixel pixel;
  
  public LevelOne() {
    try {
      bImg = ImageIO.read(this.getClass().getResource("TestBG.png"));
      blankImage = ImageIO.read(this.getClass().getResource("TeddyBear.png"));
      colourImage = ImageIO.read(this.getClass().getResource("TeddyBearC.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    blank = new JLabel(new ImageIcon(blankImage));
    colour = new JLabel(new ImageIcon(colourImage));
    add(blank);
    add(colour);
    revalidate();
    repaint();
    blank.addMouseListener(listener);
  }
  
  public void colour(int initialX, int initialY){
    Color color = new Color(255, 0, 0);
    Stack<Point> points = new Stack<Point>();
    points.add(new Point(initialX, initialY));
    
    while(!points.isEmpty()) {
      Point currentPoint = points.pop();
      int x = currentPoint.x;
      int y = currentPoint.y;
      
      int current = blankImage.getRGB(x, y);
      if((current != Color.BLACK.getRGB()) && (current != color.getRGB())){
        blankImage.setRGB(x, y, color.getRGB());
        
        points.push(new Point(x+1, y));
        points.push(new Point(x-1, y));
        points.push(new Point(x, y+1));
        points.push(new Point(x, y-1));
      }
      System.out.println("Colouring");
    }
    updateScreen();
  }
  
  private void updateScreen() {
    blank = new JLabel(new ImageIcon(blankImage));
    colour = new JLabel(new ImageIcon(colourImage));
    revalidate();
    repaint();
  }
  
  MouseListener listener = new MouseListener() {
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {
      colour(e.getX(), e.getY());
    }
  };
  
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(bImg, 0, 0, this);
  }
  
}
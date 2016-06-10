import javax.imageio.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
public class Instructions extends JPanel {
  BufferedImage image;
  int current = 0;
  JLabel label;
  public Instructions() {
    try {
      image = ImageIO.read(this.getClass().getResource("images\\Instructions" + current + ".png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    label = new JLabel(new ImageIcon(image));
    add(label);
    label.addMouseListener(listener);
  }
  
  private void nextImage() {
    remove(label);
    label.removeMouseListener(listener);
    try {
      image = ImageIO.read(this.getClass().getResource("images\\Instructions" + current + ".png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    label = new JLabel(new ImageIcon(image));
    add(label);
    label.addMouseListener(listener);
    revalidate();
    repaint();
  }
  
  MouseListener listener = new MouseListener() {
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {
      current++;
      if (current > 3) {
        current = 0;
        Driver.changeScreens("MainMenu");
      } else {
        nextImage();
      }
    }
  };
  
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(image, 0, 0, this);
  }
}
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import java.util.*;
public class LevelThree extends JPanel {
  BufferedImage blankImage, bImg;
  Picture pic;
  
  public LevelThree() {
    remove(Images.panel);
    try {
      blankImage = ImageIO.read(this.getClass().getResource(Images.names[Images.current] + ".png"));
      bImg = ImageIO.read(this.getClass().getResource("Level3BG.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    pic = new Picture(blankImage);
    Images.panel = pic.explore();
    add(Images.panel);
    Images.timer.start();
    Driver.frame.setSize(1400, 930);
  }
  
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(bImg, 0, 0, this);
  }
}
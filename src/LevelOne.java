import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import java.util.*;
public class LevelOne extends JPanel {
  BufferedImage blankImage;
  Picture pic;
  int colors = 3;
  
  public LevelOne() {
    try {
      blankImage = ImageIO.read(this.getClass().getResource("TeddyBear.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    pic = new Picture(blankImage);
    add(pic.explore(colors));
  }
  
}
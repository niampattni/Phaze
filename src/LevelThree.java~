import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import java.util.*;
public class LevelThree extends JPanel {
  BufferedImage blankImage;
  Picture pic;
  int colors = 3;
  
  public LevelThree() {
    remove(Images.panel);
    try {
      blankImage = ImageIO.read(this.getClass().getResource(Images.names[Images.current] + ".png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    pic = new Picture(blankImage);
    Images.panel = pic.explore(colors);
    add(Images.panel);
  }
  
}
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
  
  public LevelOne() {
    remove(Images.panel);
    try {
      blankImage = ImageIO.read(this.getClass().getResource(Images.names[Images.current] + ".png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    pic = new Picture(blankImage);
    Images.panel = pic.explore();
    add(Images.panel);
    Images.timer.start();
  }
}
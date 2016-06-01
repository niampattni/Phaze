import java.awt.*;
import java.awt.event.*;
public abstract class Game {
  
  public abstract void setColourSelection(Color[] colours);
  public abstract void selectColour();
  
  public MouseListener listener;
  public Pixel pixel1;
  public Pixel pixel2;
  
  public static final Color RED = new Color(255, 0, 0);
  public static final Color BLUE = new Color(0, 0, 255);
  public static final Color YELLOW = new Color(255, 255, 0);
  public static final Color ORANGE = new Color(255, 128, 0);
  public static final Color GREEN = new Color(0, 255, 0);
  public static final Color PURPLE = new Color(102, 0, 102);
  
  public void colour(Color newColour) {
    if (!compare(newColour)) {
      Driver.error("Sorry, that is the wrong colour! Try again!", "BadColourException");
      return;
    }
  }
  
  private boolean compare(Color newColour) {
    if (pixel2.getColor() == newColour) {
      return true;
    }
    return false;
  }
  
}
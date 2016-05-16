import java.awt.*;
public class GraphicsWindow extends Canvas {
  
  Graphics graphics;
  
  public GraphicsWindow() {
    super();
    graphics.setColor(Color.white);
    graphics.fillRect(0, 0, 400, 400);
  }
  
  public void drawLine(int x1, int y1, int x2, int y2) {
    graphics.setColor(Color.BLACK);
    graphics.drawLine(x1, y1, x2, y2);
  }
  
}
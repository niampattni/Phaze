import java.awt.*;
public class GraphicsWindow extends Canvas {
    
    Graphics graphics = new Graphics();
    
    public GraphicsWindow() {
        super();
    }
    
    public void drawLine(int x1, int y1, int x2, int y2, Color color) {
        graphics.setColor(color);
        graphics.drawLine(x1, y1, x2, y1);
        this.update();
    }
    
    
    
}
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;
/**
 * The PaintMeAPicture class creates the program execution window as a JFrame.
 * It is responsible for the main menu as well as any following windows.
 * The PaintMeAPicture class is-a JFrame and has-an ActionListener
 * @author Phaze Inc.
 * @version 3 27/5/2016
 * <p>
 * <b>Instance Variable: </b>
 * <p>
 * <b>xVal </b> Integer containing the x location of the last click.
 * <p>
 * <b>yVal </b> Integer containing the y location of the last click.
 */
public class PaintMeAPicture extends JFrame implements ActionListener {
  
  int xVal, yVal;
  BufferedImage img;
  JLabel image;
  JLabel label = new JLabel("? ? ?");
  
  /**
   * The class constructor is responsible for initializing the JFrame through
   * a call of super. It sets the size to 400x400, adds the menu JPanel, sets
   * its resizability to false, visibility to true, and the default close
   * operation to dispose on close. It initializes 4 JButtons as menu items
   * as well as a JPanel and a FlowLayout. The vertical gap of the layout is
   * set to 50 and the horizontal gap is set to 70. The 4 JButtons are added
   * to the JPanel which is then added to the JFrame. ActionListeners are
   * added to all the JButtons and a MouseListener is added to the JFrame.
   * <p>
   * <b>Local Variables: </b>
   * <p>
   * <b>play </b> Creates an instance of the JButton class.
   * <p>
   * <b>exit </b> Creates an instance of the JButton class.
   * <p>
   * <b>instructions </b> Creates an instance of the JButton class.
   * <p>
   * <b>scores </b> Creates an instance of the JButton class.
   * <p>
   * <b>menu </b> Creates an instance of the JPanel class.
   * <p>
   * <b>layout </b> Creates an instance of the FlowLayout class.
   */
  public PaintMeAPicture() {
    super ("Paint Me a Picture!");
    setSize(400, 400);
    JButton play = new JButton("Play");
    JButton exit = new JButton("Exit");
    JButton instructions = new JButton("Instructions");
    JButton scores = new JButton("Scores");
    JPanel menu = new JPanel();
    FlowLayout layout = new FlowLayout();
    menu.setLayout(layout);
    layout.setVgap(50);
    layout.setHgap(70);
    menu.add(play);
    menu.add(exit);
    menu.add(instructions);
    menu.add(scores);
    add(menu);
    play.addActionListener(this);
    exit.addActionListener(this);
    instructions.addActionListener(this);
    scores.addActionListener(this);
    setResizable(false);
    setVisible(true);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
  }
  
  /**
   * The MouseListener for the Image is initialized here with all 5 embedded
   * methods needed for the class. Only mouseReleased will be responsible for
   * doing anything.
   */
  MouseListener listener = new MouseListener() {
    /**
     * When the mouseReleased method is called, the instance variables xVal
     * and yVal are set to the location of the release on the Image using
     * a call of getX() and getY() in MouseEvent. A new color is created based
     * on the pixel clicked and the JLabel is updated to show the RGB values
     * and the coordinates of the click.
     * @param e     Instance of the MouseEvent class.
     * <p>
     * <b>Local Variables: </b>
     * <p>
     * <b>color </b> Creates an instance of the Color class based on a call of getColor().
     */
    public void mouseReleased(MouseEvent e) {
      xVal = e.getX();
      yVal = e.getY();
      Color color = getColor(img, xVal, yVal);
      label.setText(color.getRed() + " " + color.getGreen() + " " + color.getBlue() + " - " + xVal + ", " + yVal);
    }
    /**
     * The mouseClicked(MouseEvent e) method.
     * @param e     Instance of the MouseEvent class.
     */
    public void mouseClicked (MouseEvent e) {}
    /**
     * The mousePressed(MouseEvent e) method.
     * @param e     Instance of the MouseEvent class.
     */
    public void mousePressed (MouseEvent e) {}
    /**
     * The mouseEntered(MouseEvent e) method.
     * @param e     Instance of the MouseEvent class.
     */
    public void mouseEntered (MouseEvent e) {}
    /**
     * The mouseExited(MouseEvent e) method.
     * @param e     Instance of the MouseEvent class.
     */
    public void mouseExited (MouseEvent e) {}
  };
  
  /**
   * The actionPerformed method overrides the one in the ActionListener
   * interface. It is called upon the user clicking any one of the 4 menu
   * JButtons. The Play command will call the play() method and the Exit
   * command will call a System.exit(0) and exit the window.
   * @param e     Instance of the ActionEvent class.
   * <p>
   * <b>If Statements: </b>
   * <p>
   * <b>if (e.getActionCommand.equals("Play")) </b> If the play JBUtton is clicked.
   * <p>
   * <b>if (e.getActionCommand.equals("Exit")) </b> If the exit JBUtton is clicked.
   * <p>
   * <b>if (e.getActionCommand.equals("Instructions")) </b> If the instructions JBUtton is clicked.
   * <p>
   * <b>else </b> If the scores JBUtton is clicked.
   */
  public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand().equals("Play")) {
      play();
    } else if (e.getActionCommand().equals("Exit")) {
      System.exit(0);
    } else if (e.getActionCommand().equals("Instructions")) {
      
    } else {
      
    }
  }
  
  /**
   * The play() method. Responsible for the main part of the game. It opens
   * a new JFrame entitled Game Window and adds a JPanel with a BufferedImage
   * read from a png file. A label containing RGB values and coordinates is
   * added to the panel and a MouseListener is added to the image. The JFrame size
   * is set to 500x500, the JPanel is added to is and it is set to visible.
   * <p>
   * <b>Local Variables: </b>
   * <p>
   * <b>game </b> Creates an instance of the JFrame class with the name Game Window.
   * <p>
   * <b>img1 </b> Creates an instance of the JPanel class.
   * <p>
   * <b>Try/Catch: </b>
   * <p>
   * <b>Try </b> Will read the image from the file using ImageIO, adds the image to a JLabel, and adds the JLabel to the JPanel
   * <b>Catch </b> Catches IOException but doesn't do anything yet.
   */
  public void play(){
    JFrame game = new JFrame("Game Window");
    JPanel img1 = new JPanel ();
    try {
      img = ImageIO.read(this.getClass().getResource("apple.png"));
      image = new JLabel(new ImageIcon(img));
      img1.add(image);
    } catch (IOException ioe) {}
    img1.add(label);
    image.addMouseListener(listener);
    game.setSize(500, 500);
    game.add(img1);
    game.setVisible(true);
  }
  
  /**
   * Creates a color based on a certain pixel in a BufferedImage through
   * the TYPE_INT_ARGB color model value. The color selected is then returned.
   * @param pic     Instance of the BufferedImage class
   * @param x     Integer containing the x location of the pixel
   * @param y     Integer containing the y location of the pixel
   * @return color     The color of the pixel at the (x, y) coordinate of the BufferedImage
   * <p>
   * <b>Local Variables: </b>
   * <p>
   * <b>color </b> Creates an instance of the Color class with the value of the pixel at location (x, y) in the BufferedImage.
   */
  public Color getColor (BufferedImage pic, int x, int y) {
    Color color = new Color(pic.getRGB(x, y));
    return color;
  }
}
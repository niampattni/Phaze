import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;

/**
 * The Driver class is responsible for controlling the flow of the entire
 * program as well as executing it. It has the main method which creates a new
 * instance of itself. It sets up the JFrame output window, stores the score
 * and username of the current player, displays errors, switches screens, and
 * uses a KeyListener for the chm file.
 * <p>
 * <b>Instance Variables: </b>
 * <p>
 * <b>frame </b> Creates a static instance of the JFrame class entitled "Paint
 * Me a Picture!"
 * <p>
 * <b>username </b> Creates a static instance of the String class and stores the
 * username of the current player.
 * <p>
 * <b>score </b> Integer storing the score of the current player, starts at 1000.
 * @author Phaze Inc.
 * @version FINAL - June 10, 2016
 */
public class Driver {
  
  public static JFrame frame = new JFrame("Paint Me a Picture");
  public static String username;
  public static int score = 1000;
  public static BufferedImage logo;
  
  /**
   * The constructor sets up the JFrame and main KeyListener. It sets the size
   * to 1200x900 and resizability to false. The default close operation is to
   * exit on close and the frame is made visible. An instance of the SplashScreen
   * class is added and a KeyListener for the chm file is added to the frame.
   */
  public Driver() {
    frame.setSize(1200, 930);
    frame.setVisible(true);
    frame.setResizable(false);
    frame.add(new SplashScreen());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    try {
      logo = ImageIO.read(this.getClass().getResource("images\\logo.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    frame.addKeyListener(new KeyListener() {
      public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_F1) {
          try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler CHM\\PaintMeAPicture.chm");
          } catch (Exception ex) {}
        }
      }
      public void keyTyped(KeyEvent e) {}
      public void keyReleased(KeyEvent e) {}
    });
  }
  
  /**
   * The static changeScreens() method updates the JFrame to display the current
   * screen based on a JPanel. It uses the destination class name as a string
   * parameter and assigns that String as a Class to a Class instance. Then,
   * everything is removed from the content pane and a new instance of the class
   * is added. The ClassNotFoundException, InstantiationException, and IllegalAccessException
   * are all caught. The frame is then revalidated and repainted.
   * <p>
   * <b>Local Variables: </b>
   * <p>
   * <b> c </b> Creates an instance of the Class variables based on a Class input.
   * @param className Instance of the String class representing another class
   * in the program.
   */
  public static void changeScreens(String className) {
    Class<?> c = null;
    try {
      c = Class.forName(className);
      frame.getContentPane().removeAll();
      frame.getContentPane().add((JPanel) c.newInstance());
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (InstantiationException ie) {
      ie.printStackTrace();
    } catch (IllegalAccessException iae) {
      iae.printStackTrace();
    }
    frame.revalidate();
    frame.repaint();
  }
  
  /**
   * The static error method creates an isntance of JOPtionPane as an error message.
   * This is based on thhe parameters of message and title.
   * @param message Instance of the String class containing the message to be
   * displayed to the user.
   * @param title Instance of the String class containing the title to be
   * displayed to the user.
   */
  public static void error(String message, String title) {
    JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
  }
  
  /**
   * The main method runs the program, it creates an instance of this class, the
   * Driver class.
   * @param args Array of String objects containing command line arguments when
   * running the program.
   */
  public static void main(String[] args) {
    new Driver();
  }
  
}
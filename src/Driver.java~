import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class Driver {
  
  public static JFrame frame = new JFrame("Game Window");
  public static String username;
  public static int score = 1000;
  
  public Driver() {
    frame.setSize(1200, 930);
    frame.setVisible(true);
    frame.setResizable(false);
    frame.add(new SplashScreen());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.addKeyListener(new KeyListener() {
      public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_F1) {
          System.out.println("F1");
          try {
            System.out.println("Pressed");
            Runtime.getRuntime().exec("C:\\Windows\\hh.exe PaintMeAPicture.chm");
          } catch (IOException ioe) {}
        }
      }
      public void keyTyped(KeyEvent e) {}
      public void keyReleased(KeyEvent e) {}
    });
  }
  
  public static void changeScreens(String className) {
    Class<?> c = null;
    try {
      c = Class.forName(className);
      frame.getContentPane().removeAll();
      frame.getContentPane().add( (JPanel) c.newInstance());
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
  
  public static void error(String message, String title) {
    JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
  }
  
  public static void main(String[] args) {
    new Driver();
  }
  
}
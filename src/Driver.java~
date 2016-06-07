import javax.swing.*;
public class Driver {
  
  public static JFrame frame = new JFrame("Game Window");
  public static String username;
  
  public Driver() {
    frame.setSize(1200, 930);
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Driver.changeScreens("MainMenu");
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
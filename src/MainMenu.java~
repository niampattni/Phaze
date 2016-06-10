import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
  /**
   * The main menu class creates the main menu screen 
   * <b> Variables </b>
   * <p>
   * <b> bImg </b> holds the background of the screen
   * <p>
   * <b> input </b> will take the user's input for their username
   * <p>
   * <b> dialog </b> creates the dialog window that asks for the username
   * @author Phaze Inc.
   * @version FINAL - June 10 2016
   */
public class MainMenu extends JPanel implements ActionListener {
  
  BufferedImage bImg;
  JTextField input;
  JDialog dialog;
  /**
   * The class constructor creates the JPanel and reads in the background image
   * try catch block is used for file io when reading in background image
   * <b> Variables </b>
   * <p>
   * <b> bg </b> the background
   */
  public MainMenu() {
    JLabel bg;
    try {
      bImg = ImageIO.read(this.getClass().getResource("MainMenuBG.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    bg = new JLabel(new ImageIcon(bImg));
    add(bg);
    bg.addMouseListener(listener);
  }
  
  MouseListener listener = new MouseListener() {
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {
      int x = e.getX();
      int y = e.getY();
      if (x >= 642 && x <= 795 && y >= 171 && y <= 319) {
        usernameDialog();
      } else if (x >= 523 && x <= 674 && y >= 371 && y <= 523) {
        Driver.changeScreens("Highscores");
      } else if (x >= 886 && x <= 1038 && y >= 247 && y <= 400) {
        System.exit(0);
      } else if (x >= 882 && x <= 1173 && y >= 608 && y <= 768) {
        System.out.println("Instructions");
      }
    }
  };
  /**
   * This method creates a dialog window to ask the user for their username
   */
  public void usernameDialog() {
    dialog = new JDialog();
    dialog.setSize(500, 100);
    JLabel prompt = new JLabel("Enter a username:");
    input = new JTextField(20);
    JButton confirm = new JButton("Confirm");
    JPanel panel = new JPanel();
    confirm.addActionListener(this);
    panel.add(prompt);
    panel.add(input);
    panel.add(confirm);
    dialog.add(panel);
    dialog.setLocationRelativeTo(this);
    dialog.setVisible(true);
  }
  /**
   * This method overrides the actionPerformed method in ActionListener
   * an if statement is used to check when the user has clicked confirm
   * @param e the action the user performed
   */
  public void actionPerformed(ActionEvent e) {
    if(e.getActionCommand().equals("Confirm")) {
      Driver.username = input.getText();
      dialog.dispose();
      System.out.println(Driver.username);
      Driver.changeScreens("LevelSelect");
    }
  }
  /**
   * This method draws the background onto the screen
   * @param g the graphics of the screen
   */
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(bImg, 0, 0, this);
  }
  
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * The PaintMeAPicture class creates the program execution window as a JFrame.
 * It is responsible for the main menu as well as any following windows.
 * The PaintMeAPicture class is-a JFrame and has-an ActionListener
 * @author Phaze Inc.
 * @version 1 12/5/2016
 */
public class PaintMeAPicture extends JFrame implements ActionListener {
    
    /**
     * The class constructor is responsible for initializing the JFrame through
     * a call of super. It sets the size to 400x400, adds the menu JPanel, sets
     * its resizability to false, visibility to true, and the default close
     * operation to dispose on close. It also calls the mainMenu method.
     * <p>
     * <b>Local Variables: </b>
     * <p>
     * <b>Instance Variables: </b>
     * <p>
     * <b>play </b> Creates an instance of the JButton class.
     * <p>
     * <b>scores </b> Creates an instance of the JButton class.
     * <p>
     * <b>instructions </b> Creates an instance of the JButton class.
     * <p>
     * <b>exit </b> Creates an instance of the JButton class.
     * <p>
     * <b>menu </b> Creates an instance of the JPanel class.
     */
    public PaintMeAPicture() {
        super ("Paint Me a Picture!");
        setSize(400, 400);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
      
    }
    
}
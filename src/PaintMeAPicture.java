import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * The PaintMeAPicture class creates the program execution window as a JFrame.
 * It is responsible for the main menu as well as any following windows.
 * The PaintMeAPicture class is-a JFrame and has-an ActionListener
 * @author Phaze Inc.
 * @version 2 20/5/2016
 * <p>
 * <b>Instance Variable: </b>
 * <p>
 * <b>xVal </b> Integer containing the x location of the last click.
 * <p>
 * <b>yVal </b> Integer containing the y location of the last click.
 */
public class PaintMeAPicture extends JFrame implements ActionListener {
    
    int xVal, yVal;
    
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
        this.addMouseListener(listener);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    /**
     * The MouseListener for the JFrame is initialized here with all 5 embedded
     * methods needed for the class. Only mouseReleased will be responsible for
     * doing anything.
     */
    MouseListener listener = new MouseListener() {
        /**
         * When the mouseReleased method is called, the instance variables xVal
         * and yVal are set to the location of the release on the JFrame using
         * a call of getX() and getY() in MouseEvent.
         * @param e     Instance of the MouseEvent class.
         */
        public void mouseReleased(MouseEvent e) {
            xVal = e.getX();
            yVal = e.getY();
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
     * JButtons. No further implementation yet.
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
      }
      else if (e.getActionCommand().equals("Exit")) {
      }
      else if (e.getActionCommand().equals("Instructions")) {
      }
      else {
      }
    }
    
    /**
     * The play() method. Responsible for the main part of the game.
     * <p>
     * <b>Local Variables: </b>
     * <p>
     * <b>game </b> Creates an instance of the JPanel class with a SpringLayout.
     */
    public void play(){
        JPanel game = new JPanel (new SpringLayout());
        
    }
    
}
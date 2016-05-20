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
    
    int xVal, yVal;
    
    /**
     * The class constructor is responsible for initializing the JFrame through
     * a call of super. It sets the size to 400x400, adds the menu JPanel, sets
     * its resizability to false, visibility to true, and the default close
     * operation to dispose on close. It also calls the mainMenu method.
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
    
    MouseListener listener = new MouseListener() {
        public void mouseReleased(MouseEvent e) {
            xVal = e.getX();
            yVal = e.getY();
        }
        public void mouseClicked (MouseEvent e) {}
        public void mousePressed (MouseEvent e) {}
        public void mouseEntered (MouseEvent e) {}
        public void mouseExited (MouseEvent e) {}
    };
    
    public void actionPerformed(ActionEvent e) {
      if (e.getActionCommand().equals("Exit")) {
        System.exit(0);
      }
    }
    
}

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
     */
    public PaintMeAPicture() {
        super ("Paint Me a Picture!");
        setSize(400, 400);
<<<<<<< HEAD
        GraphicsWindow window = new GraphicsWindow();
        add (window);
        window.drawLine(100, 100, 300, 300);
        repaint();
        revalidate();
=======
        repaint();
        JButton play = new JButton("Play");
        JButton exit = new JButton("Exit");
        JButton instructions = new JButton("Instructions");
        JButton scores = new JButton("Scores");
        JPanel menu = new JPanel();
        FlowLayout layout = new FlowLayout();
        menu.setLayout(layout);
        layout.setVGap(50);
        layout.setHGap(50);
        menu.add(play);
        menu.add(exit);
        menu.add(instructions);
        menu.add(scores);
>>>>>>> origin/master
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLUE);
        g2d.drawRect(0, 0, 400, 400);
    }
    
    public void actionPerformed(ActionEvent e) {
      
    }
    
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * The PaintMeAPicture class creates the program execution window as a JFrame.
 * It is responsible for the main menu as well as any following windows.
 * The PaintMeAPicture class is-a JFrame and has-an ActionListener
 * <p>
 * <b>Instance Variables: <b>
 * <p>
 * <b>play <b> Creates an instance of the JButton class.
 * <p>
 * <b>scores <b> Creates an instance of the JButton class.
 * <p>
 * <b>instructions <b> Creates an instance of the JButton class.
 * <p>
 * <b>exit <b> Creates an instance of the JButton class.
 */
public class PaintMeAPicture extends JFrame implements ActionListener {
    
    JButton play, scores, instructions, exit;
    
    /**
     * The class constructor is responsible for initializing the JFrame through
     * a call of super. It sets the size to 400x400, adds the menu JPanel, sets
     * its resizability to false, visibility to true, and the default close
     * operation to dispose on close. It also calls the mainMenu method.
     * <p>
     * <b>Local Variables: <b>
     * <p>
     * <b>menu <b> Creates an instance of the JPanel class.
     */
    public PaintMeAPicture() {
        super ("Paint Me a Picture!");
        setSize(400, 400);
        JPanel menu = new JPanel();
        menu.setLayout(mainMenu(menu));
        add(menu);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    /**
     * The mainMenu method sets up the 4 buttons on the JFrame through a
     * GroupLayout. It takes a panel (Component) as a parameter in order to
     * properly initialize the GroupLayout. The GroupLayout is also returned
     * so it can be set as the layout on the JPanel.
     * <p>
     * @param panel     This is a JPanel, specifically a Component.
     * @return GroupLayout     This is to set the layout in the JFrame.
     * <p>
     * <b>Local Variables: <b>
     * <p>
     * <b>g <b> This creates an instance of the GroupLayout class.
     * <p>
     * <b>vGroup <b> This creates an instance of the SequentialGroup class.
     * <p>
     * <b>hGroup <b> This creates an instance of the SequentialGroup class.
     */
    public GroupLayout mainMenu(JPanel panel) {
        GroupLayout g = new GroupLayout(panel);
        GroupLayout.SequentialGroup hGroup = g.createSequentialGroup();
        GroupLayout.SequentialGroup vGroup = g.createSequentialGroup();
        play = new JButton("Play");
        scores = new JButton("Scores");
        instructions = new JButton ("Instructions");
        exit = new JButton ("Exit");
        hGroup.addGroup(g.createParallelGroup().addComponent(play).addComponent(instructions));
        hGroup.addGroup(g.createParallelGroup().addComponent(scores).addComponent(exit));
        g.setHorizontalGroup(hGroup);
        vGroup.addGroup(g.createParallelGroup().addComponent(play).addComponent(scores));
        vGroup.addGroup(g.createParallelGroup().addComponent(instructions).addComponent(exit));
        g.setVerticalGroup(vGroup);
        return g;
    }
    
    public void actionPerformed(ActionEvent e) {
      
    }
    
}
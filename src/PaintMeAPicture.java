import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PaintMeAPicture extends JFrame implements ActionListener {
    
    JButton play, scores, instructions, exit;
    
    public PaintMeAPicture() {
        super ("Paint Me a Picture!");
        setSize(200, 200);
        JPanel menu = new JPanel();
        menu.setLayout(mainMenu(menu));
        add(menu);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
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
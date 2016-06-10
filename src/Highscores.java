import java.awt.*;
import java.awt.print.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import javax.imageio.*;
/**
 * This class will create the Highscores panel, and adds the printing button, and the back button to the panel
 * <b> Variables </b>
 * <p>
 * <b> list </b> An arraylist of the Score class
 * <p>
 * <b> print </b> creates a new instance of JButton named print
 * <p>
 * <b> back </b> creates a new instance of JButton named back
 * <p>
 * <b> title </b> creates a new instance of JLabel named title
 * <p>
 * <b> labels </b> creates an array of 10 labels to be used for the top 10 scores
 * <p>
 * <b> temp </b> used to store how many labels are being shown
 * <p>
 * <b> logo </b> used to store our logo
 * @author Phaze Inc.
 * @version FINAL - June 10 2016
 */
public class Highscores extends JPanel implements Printable,ActionListener{
  ArrayList<Score> list = new ArrayList<Score>();
  JButton print = new JButton ("Print");
  JButton back = new JButton ("Back");
  JLabel title = new JLabel("Highscores");
  JLabel [] labels = new JLabel [10];
  int temp =0;
  BufferedImage logo;
  /**
   * The class constructor creates the Jpanel and adds the top 10 highscores to the panel, and displays them
   * if structures are used to check the amount of scores in the arraylist.
   * for loops are used to create and display multiple JLabels.
   */
  public Highscores(){
    SpringLayout layout = new SpringLayout();
    getScores(list);
    if (list.size()<10)
      temp=list.size();
    else
      temp=10;
    
    sortScores(list);
    for (int x=0;x<temp;x++)
    {
      labels[x]=new JLabel(list.get(x).toString());
    }   
    
    this.setLayout(layout);
    //CONSTRAINTS FOR THE LABELS
    //layout.putConstraint(side of thing, thing, space between, side of other thing, other thing)
    layout.putConstraint(SpringLayout.WEST,print,450,SpringLayout.WEST,this);
    layout.putConstraint(SpringLayout.NORTH,print,100,SpringLayout.NORTH,this);
    layout.putConstraint(SpringLayout.WEST,back,0,SpringLayout.WEST,print);
    layout.putConstraint(SpringLayout.NORTH,back,20,SpringLayout.SOUTH,print);
    layout.putConstraint(SpringLayout.WEST,title,300,SpringLayout.WEST,this);
    layout.putConstraint(SpringLayout.NORTH,title,50,SpringLayout.NORTH,this);
    if (labels[0]!=null){
      layout.putConstraint(SpringLayout.WEST,labels[0],100,SpringLayout.WEST,this);
      layout.putConstraint(SpringLayout.NORTH,labels[0],100,SpringLayout.NORTH,this);}
    if (labels[1]!=null){
      layout.putConstraint(SpringLayout.WEST,labels[1],0,SpringLayout.WEST,labels[0]);
      layout.putConstraint(SpringLayout.NORTH,labels[1],20,SpringLayout.SOUTH,labels[0]);}
    if (labels[2]!=null){
      layout.putConstraint(SpringLayout.WEST,labels[2],0,SpringLayout.WEST,labels[1]);
      layout.putConstraint(SpringLayout.NORTH,labels[2],20,SpringLayout.SOUTH,labels[1]);}
    if (labels[3]!=null){
      layout.putConstraint(SpringLayout.WEST,labels[3],0,SpringLayout.WEST,labels[2]);
      layout.putConstraint(SpringLayout.NORTH,labels[3],20,SpringLayout.SOUTH,labels[2]);}
    if (labels[4]!=null){
      layout.putConstraint(SpringLayout.WEST,labels[4],0,SpringLayout.WEST,labels[3]);
      layout.putConstraint(SpringLayout.NORTH,labels[4],20,SpringLayout.SOUTH,labels[3]);}
    if (labels[5]!=null){
      layout.putConstraint(SpringLayout.WEST,labels[5],0,SpringLayout.WEST,labels[4]);
      layout.putConstraint(SpringLayout.NORTH,labels[5],20,SpringLayout.SOUTH,labels[4]);}
    if (labels[6]!=null){
      layout.putConstraint(SpringLayout.WEST,labels[6],0,SpringLayout.WEST,labels[5]);
      layout.putConstraint(SpringLayout.NORTH,labels[6],20,SpringLayout.SOUTH,labels[5]);}
    if (labels[7]!=null){
      layout.putConstraint(SpringLayout.WEST,labels[7],0,SpringLayout.WEST,labels[6]);
      layout.putConstraint(SpringLayout.NORTH,labels[7],20,SpringLayout.SOUTH,labels[6]);}
    if (labels[8]!=null){
      layout.putConstraint(SpringLayout.WEST,labels[8],0,SpringLayout.WEST,labels[7]);
      layout.putConstraint(SpringLayout.NORTH,labels[8],20,SpringLayout.SOUTH,labels[7]);}
    if (labels[9]!=null){
      layout.putConstraint(SpringLayout.WEST,labels[9],0,SpringLayout.WEST,labels[8]);
      layout.putConstraint(SpringLayout.NORTH,labels[9],20,SpringLayout.SOUTH,labels[8]);}
    this.add(title);
    print.addActionListener(this);
    back.addActionListener(this);
    for (int x=0;x<temp;x++)
      this.add(labels[x]);
    this.add(print);
    this.add(back);
    Driver.frame.addKeyListener(kListener);
  }
  /**
   * This is a return method that allows us to print the page
   * if statements are used to check if there are more than one pages
   * a try catch block is used for fileIO
   * @param g the graphics of the page
   * @param pageFormat how the page is formatted
   * @param page how many pages there are
   *   
   */
  public int print (Graphics g, PageFormat pageFormat, int page) throws PrinterException{
    if (page>0){
      return NO_SUCH_PAGE;
    }
    Graphics2D g2d = (Graphics2D)g;
    g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
    g.drawString("Highscores",150,100);
    try {
      logo = ImageIO.read(this.getClass().getResource("images\\logo.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    g.drawImage(logo, 300, 100, 116, 67, this);
    for (int x=0;x<temp;x++)
    {
      g.drawString(""+(x+1)+". "+list.get(x).toString(),150,150+50*x);
    }
    return PAGE_EXISTS;
  }
  
  KeyListener kListener = new KeyListener() {
    public void keyPressed(KeyEvent e) {
      if (e.getKeyChar() == 'p') {
        print.doClick();
      } else if (e.getKeyChar() == 'b') {
        Driver.frame.removeKeyListener(this);
        Driver.changeScreens("MainMenu");
      }
    }
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
  };

/**
 * This method overrides the actionPerformed method in the abstract class ActionListener
 * if statements are used to check what has been pressed
 * a try catch block is used to print the page
 * @param e the action the user has performed
 * 
 */
public void actionPerformed(ActionEvent e)
{
  if (e.getActionCommand().equals("Print"))
  {
    PrinterJob job = PrinterJob.getPrinterJob();
    job.setPrintable(this);
    boolean ok = job.printDialog();
    if (ok) {
      try {
        job.print();
      } catch (PrinterException ex) {
      }
    }
  }
  else
  {
    Driver.changeScreens("MainMenu");
  }
}
/**
 * This is a return method that returns an arraylist of the highscores
 * a while loop is used to read in every line of the highscores file
 * if statements are used to check the contents of the highscores file
 * a try catch block is used for fileIO
 * @param list the arraylist where the arraylist will be stored
 */
public static ArrayList <Score> getScores(ArrayList<Score> list){
  try{
    BufferedReader in = new BufferedReader(new FileReader("Highscores.txt"));
    while (true)
    {
      String line = in.readLine();
      if (line==null)
      {
        break;
      }
      String name="";
      String level="";
      int nameend=0;
      int levelend = 0;
      int score=0;
      
      for (int x=0;x<line.length();x++)
      {
        if (line.charAt(x)==' ')
          nameend=x;
      }
      name = line.substring(0,nameend);
      for (int x=nameend;x<line.length();x++)
      {
        if (line.charAt(x)==' ')
          levelend=x;
      }
      level=line.substring(nameend,levelend);
      try{
        score = Integer.parseInt(line.substring(levelend+1,line.length()));
      }
      catch(NumberFormatException ef){
      }
      list.add(new Score(score,name,level));
    }
    
  }
  catch(IOException e){
  }
  return list;
}

/**
 * Insertion sort method to sort the array
 * if statements are used to check the contents of the array
 * while loop is used to check the array
 * @param array the arraylist to be sorted
 */
private void sortScores(ArrayList <Score> array) {
  int n = array.size();
  for (int j = 1; j < n; j++) {
    int key = array.get(j).getScore();
    Score score = array.get(j);
    int i = j-1;
    while ( (i > -1) && ( array.get(i).getScore() < key ) ) {
      array.set(i+1,array.get(i));
      i--;
    }
    array.set(i+1,score);
  }
}
}
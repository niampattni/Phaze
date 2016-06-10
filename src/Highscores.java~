import java.awt.*;
import java.awt.print.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class Highscores extends JPanel implements Printable,ActionListener{
  ArrayList<Score> list = new ArrayList<Score>();
  JButton print = new JButton ("Print");
  JButton back = new JButton ("Back");
  JLabel title = new JLabel("Highscores");
  JLabel [] labels = new JLabel [10];
  int temp =0;
  
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
  }
  
  public int print (Graphics g, PageFormat pageFormat, int page) throws PrinterException{
    if (page>0){
      return NO_SUCH_PAGE;
    }
    Graphics2D g2d = (Graphics2D)g;
    g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
    g.drawString("Highscores",150,100);
    //ADD D LOGOOOOOOOOOOOOOOOOOOOOOOOOOg.drawImage();
    for (int x=0;x<temp;x++)
    {
      g.drawString(""+(x+1)+". "+list.get(x).toString(),150,150+50*x);
    }
    return PAGE_EXISTS;
  }
  
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
  
  public static ArrayList<Score> getScores(ArrayList<Score> list){
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
        int nameend=0;
        int score=0;
        
        for (int x=0;x<line.length();x++)
        {
          if (line.charAt(x)==' ')
            nameend=x;
        }
        name = line.substring(0,nameend);
        try{
          score = Integer.parseInt(line.substring(nameend+1,line.length()));
          
        }
        catch(NumberFormatException ef){
        }
        list.add(new Score(score,name));
      }
      
    }
    catch(IOException e){
    }
    return list;
  }
  
  
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
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SplashScreen extends JPanel implements ActionListener{  
  
  Timer timer = new Timer(0,this);
  int x=0,y=0,z=0,a=0,b=0,c=0,d=0,e=0,f=0;
  boolean done= false;
  
  public void actionPerformed(ActionEvent ae){
    if (x!=1230)
      x++;
    else 
    {
      if (y!=1230)
        y++;
      else
      {
       if (z!=1230)
         z++;
       else
       {
         if (a!=1230)
           a++;
         else
         {
           if (b!=1230)
           b++;
           else 
           {
             if (c!=900)
             c++;
             else 
             {
               if (d!=1230)
               d++;
               else 
               {
                 if (e!=450)
                 e++;
                 else
                 {
                   if (f!=500)
                   {
                     f++;
                   }
                 }
               }
             }
           }
         }
       }
      }
    }
  }
  public void paintComponent(Graphics g){
    timer.start();
    g.setColor(Color.blue);
    if (x!=1230)
      g.drawLine(x,0,x,255);
    g.setColor(Color.green);
    if (y!=1230)
    g.drawLine(y,675,y,930);
    g.setColor(Color.yellow);
    if (z!=1230);
    g.drawLine(z,256,z,674);
    g.setColor(Color.red);
    if (z==1230&&a!=1230){
      g.drawLine(600,465,a,0);
      g.drawLine(600,465,1200,a);
      g.drawLine(600,465,1200-a,929);
      g.drawLine(600,465,0,930-a);
    }
    g.setColor(Color.orange);
    if (a==1230&&b!=1230){
      g.drawLine(600,465,b,929);//
      g.drawLine(600,465,1200-b,0);//
      g.drawLine(600,465,0,b);
      g.drawLine(600,465,1200,930-b);
    }
    g.setColor(Color.magenta);
    if (b==1230){
    g.drawOval(600-c,465-c,c*2,c*2);
    }
    g.setColor(Color.black);
    if (c==900)
    {
      g.drawLine(d,0,d,930);
      
    }
    g.setColor(Color.white);
    if (d==1230)
    {
      g.setColor(Color.white);
      g.drawString("PAINT ME A PICTURE",e,450);
      g.setColor(Color.black);
      for (int x=0;x<200;x++)
        g.drawRect(e,400,x,200);
    }
    repaint();
    if (f==500)
      Driver.changeScreens("MainMenu");
  }

}

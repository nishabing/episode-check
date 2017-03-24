package episodedecider;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class EpisodeDecider implements ActionListener
{
    JFrame f;
    JLabel sea,epi;
    JTextField se,ep,n;
    JButton g,t;
    int e,s;

    EpisodeDecider()
    {
    GUIDesign();
    }
    private void GUIDesign()
    {
        f=new JFrame("FRIENDS Episode Decider :D");
        sea=new JLabel("Season");
        epi=new JLabel("Episode");
        se= new JTextField(2);
        ep= new JTextField(2);
        n= new JTextField(15);
        f.setLayout(new FlowLayout());
        g=new JButton("GENERATE");
        t=new JButton("Go to the folder");
        f.setVisible(true);
        f.setSize(350,120);
        f.add(g);
        f.add(sea);
        f.add(se);
        f.add(epi);
        f.add(ep);        
        f.add(n);
        
        g.addActionListener(this);
    }
    
    public static int randInt(int min, int max) 
    {
    Random rand = new Random();
    int randomNum = rand.nextInt((max - min) + 1) + min;
    return randomNum;
    }
    public void generate()
    {
        e=0;
        s=randInt(1,10);
        if (s==1||s==4||s==2||s==5||s==7||s==8||s==9)
        {
        e=randInt(1,24);
        }
        else if (s==3||s==6)
        {
        e=randInt(1,25);
        }   
        else
        {
        e=randInt(1,18);
        }
        se.setText(Integer.toString(s));
        ep.setText(Integer.toString(e));
        
    }
    public void folder()
    {
        String episode="C:\\Users\\user\\Videos\\TV\\FRIENDS\\"+s;
        try {
            Desktop.getDesktop().open(new File(episode));
        } catch (IOException ex) {
            
        }
    }
    @Override public void actionPerformed(ActionEvent evt)
        {
            generate();
            n.setText("Here you go");
            for(int i=1;i<10000000;i++)
            {}
            folder();
        }
   public static void main(String[] args) 
   {
        new EpisodeDecider();
   }
    
}

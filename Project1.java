import java.awt.event.*;
import javax.swing.*;

class Project1 extends JFrame implements ActionListener
{
    JLabel l1;
    JRadioButton r1,r2,r3,r4,r5;
    ButtonGroup group;
    JButton b1;

    int count=0,current=1;

    public static void main(String args[]) 
    {
        Project1 p =new Project1(); 
    }

    Project1()
    {
        super("Online Test in Java.");
        setVisible(true);
        setLayout(null);
        setSize(500,500);
        setLocation(400,100);

        l1=new JLabel();
        l1.setBounds(40,50,550,20);
        add(l1);

        r1=new JRadioButton();
        r1.setBounds(50,80,200,30);
        add(r1);

         r2=new JRadioButton();
        r2.setBounds(50,110,200,30);
        add(r2);

         r3=new JRadioButton();
        r3.setBounds(50,140,200,30);
        add(r3);

        r4=new JRadioButton();
        r4.setBounds(50,170,200,30);
        add(r4);

        r5=new JRadioButton();
        //r5.setBounds(50,200,200,30);
        add(r5);

        b1=new JButton("NEXT.");
        b1.setBounds(20,230,200,50);
        add(b1);

        group=new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);
        group.add(r5);

        b1.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        set();
    }
    public void actionPerformed(ActionEvent e)
    {
        if(check())
            count=count+1;
        current++;
        if(current==5)
            b1.setText("RESULT.");
        set();
    
    
    if(e.getActionCommand().equals("RESULT."))
    {
        if(check())
            count=count+1;
        JOptionPane.showMessageDialog(this,"CORRECT ANSWERS= "+count+"\nQs1):Float\nQs2):Object\nQs3):Lang\nQs4):get\nQs5):Study Circle");
        System.exit(0); //terminates the program when we click ok
    }

    }

    void set()
    {
        r5.setSelected(true); //VERY IMPPP!!!

        if(current==1)
        {
            l1.setText("Qs.2:Which of the following is not the primitive data-type in Java?");
            r1.setText("int");
            r2.setText("float");
            r3.setText("boolean");
            r4.setText("char");
        }
        else if(current==2)
        {
            l1.setText("Qs.3:Which of the following is the super class of all Java classes automatically?");
            r1.setText("Swing");
            r2.setText("Applet");
            r3.setText("Object");
            r4.setText("ActionEvent");
        }
        else if(current==4)
        {
            l1.setText("Qs.4:Which of the following is not a keyword?");
            r1.setText("class");
            r2.setText("int");
            r3.setText("get");
            r2.setText("if");
        }
        else if(current==3)
        {
            l1.setText("Qs.3:Which of the following package is directly available to class without importing it?");
            r1.setText("swing");
            r2.setText("net");
            r3.setText("applet");
            r4.setText("lang");
        }
        else if(current==5)
        {
            l1.setText("Qs.5:Which of the following is the best institute for Java?");
            r1.setText("Aptech");
            r2.setText("NIIT");
            r3.setText("CDAC");
            r4.setText("StudyCircle");
        }
    }

    

    boolean check()
    {
        switch(current)
        {
            case 1: return (r2.isSelected());
            case 2: return (r3.isSelected());
            case 3: return (r4.isSelected());
            case 4: return (r3.isSelected());
            case 5: return (r4.isSelected());
            default: return false; //logically not required.just to avoid syntax error.
        }
    }
}

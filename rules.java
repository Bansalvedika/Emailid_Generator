package Email_Generator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rules extends JFrame implements ActionListener {

    String name;
    JButton next , back;
    JTextField TFname , TFname1;
    rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("welcome " + name +", Your basic information<>");
        heading.setBounds(140,50,700,30);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,28));
        heading.setForeground(Color.BLACK);
        add(heading);

        JLabel DOB = new JLabel("Enter your birth day in date/month/year");
        DOB.setBounds(240,150,300,20);
        DOB.setFont(new Font("Mongolian Baiti",Font.BOLD,15));
        DOB.setForeground(Color.BLACK);
        add(DOB);
        TFname = new JTextField();
        TFname.setBounds(240,180,300,30);
        TFname.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        add(TFname);

        JLabel gender = new JLabel("Enter your gender");
        gender.setBounds(250,220,300,20);
        gender.setFont(new Font("Mongolian Baiti",Font.BOLD,15));
        gender.setForeground(Color.BLACK);
        add(gender);
        TFname1 = new JTextField();
        TFname1.setBounds(240,240,300,30);
        TFname1.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        add(TFname1);

        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        next = new JButton("next");
        next.setBounds(430,500,100,30);
        next.setBackground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        setSize(800,650);
        setLocation(350,100);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == next){
          setVisible(false);
          new idgenerate(name);
        }else {
            setVisible(false);
            new Email();

        }
    }

    public static void main(String[] args) {
        new rules("User");

    }
}

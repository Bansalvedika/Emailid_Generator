package Email_Generator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class emailAddress extends JFrame implements ActionListener {

    Random ran = new Random();
    int number = ran.nextInt(999);
    String name;
    JButton next1,back1;

    emailAddress(String name){
        this.name = name;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel heading = new JLabel("Hello " + name +", your email id is <> ");
        heading.setBounds(140,50,700,30);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,28));
        heading.setForeground(Color.BLACK);
        add(heading);

        JLabel DOB = new JLabel("Your email address is :- ");
        DOB.setBounds(170,150,300,20);
        DOB.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        DOB.setForeground(Color.BLACK);
        add(DOB);

        JLabel heading1 = new JLabel( ""+name + number +"@gmail.com");
        heading1.setBounds(170,200,300,30);
        heading1.setFont(new Font("Mongolian Baiti",Font.BOLD,28));
        heading1.setForeground(Color.BLACK);
        add(heading1);

        back1 = new JButton("Back");
        back1.setBounds(120,400,100,40);
        back1.setBackground(Color.WHITE);
        back1.addActionListener(this);
        add( back1);

        next1 = new JButton("Next");
        next1.setBounds(400,400,100,40);
        next1.setBackground(Color.WHITE);
        next1.addActionListener(this);
        add( next1);


        setSize(650,570);
        setLocation(350,100);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==next1){
            setVisible(false);
            new password(name);
        }
        else {
            setVisible(false);
            new idgenerate(name);
        }
    }

    public static void main(String[] args) {
        new emailAddress("User");

    }
}


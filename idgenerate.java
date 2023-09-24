package Email_Generator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class idgenerate extends JFrame implements ActionListener {

    JTextField textname;
    JButton comfirm , skip;
    String name;
    idgenerate(String name){
      this.name = name;

        setBounds(400,150,600,600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        JLabel heading = new JLabel("Choose "+ name + ", how you will sign in ");
        heading.setBounds(80,50,700,30);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
        heading.setForeground(Color.BLACK);
        add(heading);

        JLabel address = new JLabel("Use your phone number  ");
        address.setBounds(180,200,300,28);
        address.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        address.setForeground(Color.BLACK);
        add(address);
        textname = new JTextField();
        textname.setBounds(150,230,300,50);
        textname.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        add(textname);


        skip = new JButton("Back");
        skip.setBounds(120,400,100,40);
        skip.setBackground(Color.WHITE);
        skip.addActionListener(this);
        add(skip);

        comfirm = new JButton("For confirm");
        comfirm.setBounds(400,400,100,40);
        comfirm.setBackground(Color.WHITE);
        comfirm.addActionListener(this);
        add(comfirm);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == comfirm) {
            setVisible(false);
            new emailAddress(name);
        }
        else{
            setVisible(false);
            new rules(name);
        }
    }

        public static void main (String[]args){

        new idgenerate("User");
        }
    }


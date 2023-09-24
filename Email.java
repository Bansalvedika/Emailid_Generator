package Email_Generator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Email extends JFrame implements ActionListener{

    JButton rules;
    JTextField tfname , tfname1;
    Email(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        ImageIcon i1 = new ImageIcon(getClass().getResource("logoemail.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 600, 500);
        add(image);


        JLabel heading = new JLabel("Generate Email");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,40));
        heading.setForeground(Color.BLACK);
        add(heading);

        JLabel name = new JLabel("Enter your First name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,15));
        name.setForeground(Color.BLACK);
        add(name);
        tfname = new JTextField();
        tfname.setBounds(735,170,300,25);
        tfname.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        add(tfname);

        JLabel name2 = new JLabel("Enter your Last name");
        name2.setBounds(810,200,300,20);
        name2.setFont(new Font("Mongolian Baiti",Font.BOLD,15));
        name2.setForeground(Color.BLACK);
        add(name2);
        tfname1 = new JTextField();
        tfname1.setBounds(735,220,300,25);
        tfname1.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        add(tfname1);

        rules = new JButton("Generate ID");
        rules.setBounds(800,300,120,25);
        rules.addActionListener(this);
        add(rules);

        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }

     public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new rules(name);
        }

     }

    public static void main(String[] args) {
        new Email();
    }
}



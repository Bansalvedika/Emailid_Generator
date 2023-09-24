package Email_Generator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class password extends JFrame implements ActionListener {

    String name;
    JButton tk;
    JTextField fieldname,fieldname1;
    password(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Hello " + name +", for security purpose set a password");
        heading.setBounds(140,50,700,30);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,28));
        heading.setForeground(Color.BLACK);
        add(heading);

        JLabel DOB = new JLabel("Enter your password is ");
        DOB.setBounds(240,150,300,20);
        DOB.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        DOB.setForeground(Color.BLACK);
        add(DOB);
        fieldname = new JTextField();
        fieldname.setBounds(240,180,300,20);
        fieldname.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        add(fieldname);

        JLabel gender = new JLabel("Confirm your password");
        gender.setBounds(240,250,300,20);
        gender.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        gender.setForeground(Color.BLACK);
        add(gender);
        fieldname1 = new JTextField();
        fieldname1.setBounds(240,280,300,20);
        fieldname1.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        add(fieldname1);

        tk = new JButton("Successful");
        tk.setBounds(250,450,300,40);
        tk.setBackground(Color.WHITE);
        tk.addActionListener(this);
        add(tk);


        setSize(800,650);
        setLocation(350,100);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== tk){
            setVisible(false);
        }
        else{
            setVisible(false);
            new emailAddress(name);
        }
    }

    public static void main(String[] args) {
      new password("User");
    }
}

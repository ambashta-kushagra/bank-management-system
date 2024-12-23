package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;

    String pin;

    main_Class(String pin){
        this.pin = pin;

        //background atm image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1280,640,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1280,640);
        add(l3);

        //text
        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(360,130,700,35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,22));
        l3.add(label);

        //Deposit
        b1 = new JButton("Deposit");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(340,207,130,30);
        b1.addActionListener(this);
        l3.add(b1);

        //Withdrawal
        b2 = new JButton("Cash Withdrawl");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(570,207,130,30);
        b2.addActionListener(this);
        l3.add(b2);

        //fast cash
        b3 = new JButton("Fast Cash");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(340,243,130,30);
        b3.addActionListener(this);
        l3.add(b3);

        //Mini Statement
        b4 = new JButton("Mini Statement");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(570,243,130,30);
        b4.addActionListener(this);
        l3.add(b4);

        //pin change
        b5 = new JButton("Pin Change");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(340,279,130,30);
        b5.addActionListener(this);
        l3.add(b5);

        //Balance Enquiry
        b6 = new JButton("Balance Enquiry");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(570,279,130,30);
        b6.addActionListener(this);
        l3.add(b6);

        //Exit
        b7 = new JButton("Exit");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(65,125,128));
        b7.setBounds(570,315,130,30);
        b7.addActionListener(this);
        l3.add(b7);

        setLayout(null);
        setSize(1280,880);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource() == b7) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new main_Class("");
    }
}

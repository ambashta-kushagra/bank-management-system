package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton sav, curr, fix, dep;

    JButton s,c;

    JCheckBox c1,c2,c3,c4,c5,c6;

    String formno;

    Signup3(String formno){
        this.formno = formno;

        //bank icon
        ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image b2 = b1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon b3 = new ImageIcon(b2);
        JLabel bankimage = new JLabel(b3);
        bankimage.setBounds(150,25, 70,70);
        add(bankimage);

        //PAGE NO.
        JLabel page3 = new JLabel("Page 3 :-");
        page3.setFont(new Font("Raleway", Font.BOLD,22));
        page3.setBounds(250,30,600,40);
        add(page3);

        //ACCOUNT DETAILS TEXT
        JLabel accinfo = new JLabel("Account Details");
        accinfo.setFont(new Font("Raleway",Font.BOLD,22));
        accinfo.setBounds(250,60,600,40);
        add(accinfo);

        JLabel acctype = new JLabel("Account Type : ");
        acctype.setFont(new Font("Raleway",Font.BOLD,18));
        acctype.setBounds(100,120,150,30);
        add(acctype);

        sav = new JRadioButton("Savings Account");
        sav.setFont(new Font("Raleway",Font.BOLD,14));
        sav.setBackground(new Color(215,252,252));
        sav.setBounds(100,150,150,30);
        add(sav);

        fix = new JRadioButton("Fixed Deposit");
        fix.setFont(new Font("Raleway",Font.BOLD,14));
        fix.setBackground(new Color(215,252,252));
        fix.setBounds(350,150,150,30);
        add(fix);

        curr = new JRadioButton("Current Account");
        curr.setFont(new Font("Raleway",Font.BOLD,14));
        curr.setBackground(new Color(215,252,252));
        curr.setBounds(100,180,150,30);
        add(curr);

        dep = new JRadioButton("Recurring Deposit Account");
        dep.setFont(new Font("Raleway",Font.BOLD,14));
        dep.setBackground(new Color(215,252,252));
        dep.setBounds(350,180,250,30);
        add(dep);

        ButtonGroup acct = new ButtonGroup();
        acct.add(sav);
        acct.add(fix);
        acct.add(curr);
        acct.add(dep);

        //Card No.
        JLabel cardno = new JLabel("Card Number : ");
        cardno.setFont(new Font("Raleway",Font.BOLD,18));
        cardno.setBounds(100,220,150,30);
        add(cardno);

        //Card number given
        JLabel cardnog = new JLabel("(Your 16-digit Card Number)");
        cardnog.setFont(new Font("Raleway",Font.BOLD,12));
        cardnog.setBounds(100,240,200,20);
        add(cardnog);

        JLabel cardnum = new JLabel("XXXX-XXXX-XXXX-0331");
        cardnum.setFont(new Font("Raleway",Font.BOLD,18));
        cardnum.setBounds(300,220,250,30);
        add(cardnum);

        JLabel tex = new JLabel("(It would appear on atm card/cheque Book and Statements)");
        tex.setFont(new Font("Raleway",Font.BOLD,12));
        tex.setBounds(300,240,350,20);
        add(tex);

        //PIN
        JLabel pinno = new JLabel("PIN : ");
        pinno.setFont(new Font("Raleway",Font.BOLD,18));
        pinno.setBounds(100,290,150,30);
        add(pinno);

        JLabel pinnox = new JLabel("XXXX");
        pinnox.setFont(new Font("Raleway",Font.BOLD,18));
        pinnox.setBounds(300,290,150,30);
        add(pinnox);

        //4 digit pin
        JLabel pin4 = new JLabel("(4-Digit Password)");
        pin4.setFont(new Font("Raleway",Font.BOLD,12));
        pin4.setBounds(100,310,250,20);
        add(pin4);

        //Services
        JLabel serv = new JLabel("Services Required : ");
        serv.setFont(new Font("Raleway",Font.BOLD,18));
        serv.setBounds(100,370,250,30);
        add(serv);

        //checkbox
        c1 = new JCheckBox("ATM Card");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,420,200,20);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,420,200,20);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,470,200,20);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,470,200,20);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,520,200,20);
        add(c5);

        c6 = new JCheckBox("E-statement");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,520,200,20);
        add(c6);

        JCheckBox c7 = new JCheckBox("I hereby declare that the above details are correct to the best of my knowledge.",true);
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,570,600,20);
        add(c7);

        //formno
        JLabel formnum = new JLabel("Form No : ");
        formnum.setFont( new Font("Raleway", Font.BOLD, 14));
        formnum.setBounds(660,10,100,30);
        add(formnum);

        JLabel existno = new JLabel();
        existno.setFont( new Font("Raleway", Font.BOLD, 14));
        existno.setBounds(760,10,60,30);
        add(existno);

        //submit button
        s = new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(250,600,100,30);
        //s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(420,600,100,30);
        //s.addActionListener(this);
        add(c);




        getContentPane().setBackground(new Color(215,252,252));
        setLayout(null);
        setSize(850,700);
        setLocation(230,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Signup3(" ");
    }
}

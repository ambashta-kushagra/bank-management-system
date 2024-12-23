package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel titlelabel, cardlabel, pinlabel;
    JTextField cardtextfield;
    JPasswordField pinpassfield;
    JButton signin, signup, clear;
    Login(){
        super("Bank Management System");

        //bank icon
        ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image b2 = b1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon b3 = new ImageIcon(b2);
        JLabel bankimage = new JLabel(b3);
        bankimage.setBounds(360,10, 100,100);
        add(bankimage);

        //card image
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image c2 = c1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon c3 = new ImageIcon(c2);
        JLabel cardimage = new JLabel(c3);
        cardimage.setBounds(630,350, 100,100);
        add(cardimage);

        //title text
        titlelabel = new JLabel("WELCOME TO ATM");
        titlelabel.setForeground(Color.WHITE);
        titlelabel.setFont(new Font("AvantGarde", Font.BOLD, 38));
        titlelabel.setBounds(230,125,450,40);
        add(titlelabel);

        //Card text
        cardlabel = new JLabel("Card No:");
        cardlabel.setFont(new Font("Ralway", Font.BOLD, 28));
        cardlabel.setForeground(Color.WHITE);
        cardlabel.setBounds(150,190,375,30);
        add(cardlabel);

        //card no. input
        cardtextfield = new JTextField(15);
        cardtextfield.setBounds(325,190,230,30);
        cardtextfield.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardtextfield);

        //pin text
        pinlabel = new JLabel("PIN:");
        pinlabel.setFont(new Font("Ralway", Font.BOLD, 28));
        pinlabel.setForeground(Color.WHITE);
        pinlabel.setBounds(150,250,375,30);
        add(pinlabel);

        //pin input
        pinpassfield = new JPasswordField(15);
        pinpassfield.setBounds(325, 250, 230, 30);
        pinpassfield.setFont((new Font("Arial",Font.BOLD, 14)));
        add(pinpassfield);

        //buttons
        signin = new JButton("SIGN IN");
        signin.setFont(new Font("Arial", Font.BOLD, 14));
        signin.setForeground(Color.WHITE);
        signin.setBackground(Color.BLACK);
        signin.setBounds(300,300,100,30);
        signin.addActionListener(this);
        add(signin);

        clear = new JButton("CLEAR");
        clear.setFont(new Font("Arial", Font.BOLD, 14));
        clear.setForeground(Color.WHITE);
        clear.setBackground(Color.BLACK);
        clear.setBounds(430,300,100,30);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setFont(new Font("Arial", Font.BOLD, 14));
        signup.setForeground(Color.WHITE);
        signup.setBackground(Color.BLACK);
        signup.setBounds(300,350,230,30);
        signup.addActionListener(this);
        add(signup);

        //background
        ImageIcon bg1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image bg2 = bg1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon bg3 = new ImageIcon(bg2);
        JLabel bgimage = new JLabel(bg3);
        bgimage.setBounds(0,0, 850,480);
        add(bgimage);



        setLayout(null);
        setSize(850,480);
        setLocation(250,100);
        //setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource() == signin)
            {
                Connect c = new Connect();
                String cardno = cardtextfield.getText();
                String pin = pinpassfield.getText();
                String q = "select * from Login where card_number = '"+cardno+"' and pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Credentials");
                }
            }
            else if (e.getSource() == clear)
            {
                cardtextfield.setText("");
                pinpassfield.setText("");
            }
            else if (e.getSource() == signup)
            {
                new Signup();
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Login();
    }
}

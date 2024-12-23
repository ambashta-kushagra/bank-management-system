package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {

    String pin;

    TextField textField;

    JButton withdraw,back;

    Withdrawl(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1280,640,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1280,640);
        add(l3);

        JLabel label1 = new JLabel("Maximum Withdrawal is Rs.10,000");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(360,130,400,35);
        l3.add(label1);

        JLabel label2 = new JLabel("Please enter your amount");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(360,170,400,35);
        l3.add(label2);

        textField = new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(360,200,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textField);

        withdraw = new JButton("WITHDRAW");
        withdraw.setBounds(580,280,120,30);
        withdraw.setBackground(new Color(65,125,128));
        withdraw.setForeground(Color.WHITE);
        withdraw.addActionListener(this);
        l3.add(withdraw);

        back = new JButton("BACK");
        back.setBounds(580,315,120,30);
        back.setBackground(new Color(65,125,128));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        l3.add(back);

        setLayout(null);
        setSize(1280,880);
        setLocation(0,0);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource()==withdraw) {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
                } else {
                    Connect c = new Connect();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    }else{
                        c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','Withdrawl','" + amount + "' )");
                        JOptionPane.showMessageDialog(null, "Rs. " + amount + " debited successfully");
                    }
                    setVisible(false);
                    new main_Class(pin);
                }
            }else if (e.getSource()==back) {
                setVisible(false);
                new main_Class(pin);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Withdrawl("");
    }
}

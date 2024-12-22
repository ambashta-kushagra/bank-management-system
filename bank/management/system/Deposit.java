package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    String pin;

    TextField textField;

    JButton deposit,back;

    Deposit(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1280,640,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1280,640);
        add(l3);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(360,130,400,35);
        l3.add(label1);

        textField = new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(360,170,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textField);

        deposit = new JButton("DEPOSIT");
        deposit.setBounds(580,280,120,30);
        deposit.setBackground(new Color(65,125,128));
        deposit.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        l3.add(deposit);

        back = new JButton("BACK");
        back.setBounds(580,315,120,30);
        back.setBackground(new Color(65,125,128));
        back.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        l3.add(back);








        setLayout(null);
        setSize(1280,880);
        setLocation(0,0);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource()==deposit){
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter Amount you want to Deposit");
                }
                else {
                    Connect c = new Connect();
                    c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs."+amount+" deposited successfully.");
                    setVisible(false);
                }
            } else if (e.getSource()==back) {
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();;
        }
                
                
    }

    public static void main(String[] args) {
        new Deposit(" ");
    }
}

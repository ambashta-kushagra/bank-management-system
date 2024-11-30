package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JRadioButton male,female, mm ,um,other;

    JTextField textName, textFname, textEmail, textadd, textcity, textpincode, textstate;

    JDateChooser dateChooser;

    JButton next;

    Random ran = new Random();
    long first4 = ( ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup(){
        super("APPLICATION FORM");

        //bank icon
        ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image b2 = b1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon b3 = new ImageIcon(b2);
        JLabel bankimage = new JLabel(b3);
        bankimage.setBounds(25,10, 70,70);
        add(bankimage);

        //APPLICATION NUMBER
        JLabel appno = new JLabel("APPLICATION FORM NO. "+ first);
        appno.setBounds(200,10,600,40);
        appno.setFont(new Font("Raleway", Font.BOLD,30));
        add(appno);

        //PAGE NO.
        JLabel pageno = new JLabel("Page 1");
        pageno.setFont(new Font("Raleway", Font.BOLD,22));
        pageno.setBounds(350,45,600,30);
        add(pageno);

        //PERSONAL INFO TEXT
        JLabel personinfo = new JLabel("Personal Details");
        personinfo.setFont(new Font("Raleway",Font.BOLD,22));
        personinfo.setBounds(300,70,600,30);
        add(personinfo);

        //NAME
        JLabel name = new JLabel("Name : ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,120,100,30);
        add(name);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,120,400,30);
        add(textName);


        //FATHERS NAME
        JLabel Fname = new JLabel("Father's Name : ");
        Fname.setFont(new Font("Raleway",Font.BOLD,20));
        Fname.setBounds(100,170,200,30);
        add(Fname);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,170,400,30);
        add(textFname);


        //GENDER
        JLabel gender = new JLabel("Gender : ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,220,200,30);
        add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Raleway",Font.BOLD,14));
        male.setBackground(new Color(222,255,228));
        male.setBounds(300,220,60,30);
        add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Raleway",Font.BOLD,14));
        female.setBackground(new Color(222,255,228));
        female.setBounds(450,220,80,30);
        add(female);

        //adds all buttons to a group so only one can be selected at a time
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(female);

        //DOB
        JLabel dob = new JLabel("Date of Birth : ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,270,200,30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,270,400,30);
        add(dateChooser);


        //Email Address
        JLabel email = new JLabel("Email Address : ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,320,200,30);
        add(email);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,320,400,30);
        add(textEmail);


        //Married Status
        JLabel ms = new JLabel("Married Status : ");
        ms.setFont(new Font("Raleway",Font.BOLD,20));
        ms.setBounds(100,370,200,30);
        add(ms);

        mm = new JRadioButton("Married");
        mm.setFont(new Font("Raleway",Font.BOLD,14));
        mm.setBackground(new Color(222,255,228));
        mm.setBounds(300,370,80,30);
        add(mm);

        um = new JRadioButton("Unmarried");
        um.setFont(new Font("Raleway",Font.BOLD,14));
        um.setBackground(new Color(222,255,228));
        um.setBounds(450,370,100,30);
        add(um);

        other = new JRadioButton("Other");
        other.setFont(new Font("Raleway",Font.BOLD,14));
        other.setBackground(new Color(222,255,228));
        other.setBounds(600,370,80,30);
        add(other);

        ButtonGroup msgroup = new ButtonGroup();
        msgroup.add(mm);
        msgroup.add(um);
        msgroup.add(other);


        //Address
        JLabel add = new JLabel("Address : ");
        add.setFont(new Font("Raleway",Font.BOLD,20));
        add.setBounds(100,420,200,30);
        add(add);

        textadd = new JTextField();
        textadd.setFont(new Font("Raleway",Font.BOLD,14));
        textadd.setBounds(300,420,400,30);
        add(textadd);


        //CITY
        JLabel city = new JLabel("CITY : ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,470,200,30);
        add(city);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        textcity.setBounds(300,470,400,30);
        add(textcity);

        //PINCODE
        JLabel pincode = new JLabel("PINCODE : ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,520,200,30);
        add(pincode);

        textpincode = new JTextField();
        textpincode.setFont(new Font("Raleway",Font.BOLD,14));
        textpincode.setBounds(300,520,400,30);
        add(textpincode);


        //STATE
        JLabel state = new JLabel("STATE : ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,570,200,30);
        add(state);

        textstate = new JTextField();
        textstate.setFont(new Font("Raleway",Font.BOLD,14));
        textstate.setBounds(300,570,400,30);
        add(textstate);

        //next button
        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,620,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,700);
        setLocation(230,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
           if (male.isSelected())
            {
                gender = "Male";
            }
            else if(female.isSelected())
            {
                gender = "Female";
            }
        String email = textEmail.getText();
        String marital = null;
            if (mm.isSelected()){marital = "Married";}
            else if(um.isSelected()){marital = "Unmarried";}
            else if(other.isSelected()){marital = "Other";}
        String address = textadd.getText();
        String city = textcity.getText();
        String pincode = textpincode.getText();
        String state = textstate.getText();

        try {
            if (textName.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill all the fields to continue!");
            }
            else
            {
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2();
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();
    }
}



package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    JRadioButton syes,sno,e1,e2;

    JButton next;

    JComboBox comboBoxr,comboBoxc, comboBoxi, comboBoxe, comboBoxo;

    JTextField textpan, textadhaar;

    String formno;

    Signup2(String first){
        super("APPLICATION FORM");


        //bank icon
        ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image b2 = b1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon b3 = new ImageIcon(b2);
        JLabel bankimage = new JLabel(b3);
        bankimage.setBounds(150,25, 70,70);
        add(bankimage);

        this.formno = formno;

        //PAGE NO.
        JLabel pageno = new JLabel("Page 2 :-");
        pageno.setFont(new Font("Raleway", Font.BOLD,22));
        pageno.setBounds(250,30,600,40);
        add(pageno);

        //ADDITIONAL DETAILS TEXT
        JLabel personinfo = new JLabel("Additional Details");
        personinfo.setFont(new Font("Raleway",Font.BOLD,22));
        personinfo.setBounds(250,60,600,40);
        add(personinfo);

        //religion
        JLabel religion = new JLabel("Religion : ");
        religion.setFont(new Font("Raleway",Font.BOLD,18));
        religion.setBounds(100,120,100,30);
        add(religion);

        String religion2[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        comboBoxr = new JComboBox(religion2);
        comboBoxr.setBackground(new Color(252,208,76));
        comboBoxr.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBoxr.setBounds(350,120,320,30);
        add(comboBoxr);

        JLabel category = new JLabel("Category : ");
        category.setFont( new Font("Raleway", Font.BOLD, 18));
        category.setBounds(100,170,100,30);
        add(category);

        String category2[] = {"General","OBC","SC","ST","Other"};
        comboBoxc = new JComboBox(category2);
        comboBoxc.setBackground(new Color(252,208,76));
        comboBoxc.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBoxc.setBounds(350,170,320,30);
        add(comboBoxc);

        JLabel income = new JLabel("Income : ");
        income.setFont( new Font("Raleway", Font.BOLD, 18));
        income.setBounds(100,220,100,30);
        add(income);

        String income2[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBoxi = new JComboBox(income2);
        comboBoxi.setBackground(new Color(252,208,76));
        comboBoxi.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBoxi.setBounds(350,220,320,30);
        add(comboBoxi);


        //EDUCATION
        JLabel edu = new JLabel("Educational : ");
        edu.setFont( new Font("Raleway", Font.BOLD, 18));
        edu.setBounds(100,270,150,30);
        add(edu);

        String edu2[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        comboBoxe = new JComboBox(edu2);
        comboBoxe.setBackground(new Color(252,208,76));
        comboBoxe.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBoxe.setBounds(350,270,320,30);
        add(comboBoxe);


        //OCCUPATION
        JLabel occu = new JLabel("Occupation : ");
        occu.setFont( new Font("Raleway", Font.BOLD, 18));
        occu.setBounds(100,340,150,30);
        add(occu);

        String occu2[] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        comboBoxo = new JComboBox(occu2);
        comboBoxo.setBackground(new Color(252,208,76));
        comboBoxo.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBoxo.setBounds(350,340,320,30);
        add(comboBoxo);


        //Pan No,
        JLabel pan = new JLabel("Pan Number : ");
        pan.setFont( new Font("Raleway", Font.BOLD, 18));
        pan.setBounds(100,390,150,30);
        add(pan);

        textpan = new JTextField();
        textpan.setFont( new Font("Raleway", Font.BOLD, 18));
        textpan.setBounds(350,390,320,30);
        add(textpan);


        //Adhaar
        JLabel adhaar = new JLabel("Adhaar Number : ");
        adhaar.setFont( new Font("Raleway", Font.BOLD, 18));
        adhaar.setBounds(100,440,200,30);
        add(adhaar);

        textadhaar = new JTextField();
        textadhaar.setFont( new Font("Raleway", Font.BOLD, 18));
        textadhaar.setBounds(350,440,320,30);
        add(textadhaar);


        //senior citizen
        JLabel senior = new JLabel("Senior Citizen : ");
        senior.setFont( new Font("Raleway", Font.BOLD, 18));
        senior.setBounds(100,490,200,30);
        add(senior);

        syes = new JRadioButton("Yes");
        syes.setFont(new Font("Raleway",Font.BOLD,14));
        syes.setBackground(new Color(252,208,76));
        syes.setBounds(350,490,100,30);
        add(syes);

        sno = new JRadioButton("No");
        sno.setFont(new Font("Raleway",Font.BOLD,14));
        sno.setBackground(new Color(252,208,76));
        sno.setBounds(500,490,100,30);
        add(sno);

        //adds all buttons to a group so only one can be selected at a time
        ButtonGroup sbuttonGroup = new ButtonGroup();
        sbuttonGroup.add(syes);
        sbuttonGroup.add(sno);


        //EXISTING ACCOUNT?
        JLabel ex = new JLabel("Existing Account : ");
        ex.setFont( new Font("Raleway", Font.BOLD, 18));
        ex.setBounds(100,540,200,30);
        add(ex);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,540,100,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(500,540,100,30);
        add(e2);

        //adds all buttons to a group so only one can be selected at a time
        ButtonGroup ebuttonGroup = new ButtonGroup();
        ebuttonGroup.add(e1);
        ebuttonGroup.add(e2);

        //formno
        JLabel form = new JLabel("Form No. : ");
        form.setFont( new Font("Raleway", Font.BOLD, 18));
        form.setBounds(660,10,100,30);
        add(form);

        JLabel exist = new JLabel(formno);
        exist.setFont( new Font("Raleway", Font.BOLD, 18));
        exist.setBounds(760,10,60,30);
        add(exist);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,590,100,30);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(252,208,76));
        setLayout(null);
        setSize(850,700);
        setLocation(230,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBoxr.getSelectedItem();
        String cat = (String) comboBoxc.getSelectedItem();
        String inc = (String) comboBoxi.getSelectedItem();
        String educ = (String) comboBoxe.getSelectedItem();
        String occu = (String) comboBoxo.getSelectedItem();

        String pan = textpan.getText();
        String aad = textadhaar.getText();

        String sencit = " ";
        if (syes.isSelected()) {
            sencit = "Yes";
        } else if (sno.isSelected()) {
            sencit = "No";
        }

        String exacc = " ";
        if (e1.isSelected()) {
            exacc = "Yes";
        } else if (e2.isSelected()) {
            exacc = "No";
        }

        try{
            if (textpan.getText().equals("") || textadhaar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields!");
            }else {
                Connect c1 = new Connect();
                String q = "insert into signuptwo values('"+formno+"','"+rel+"', '"+cat+"', '"+inc+"', '"+educ+"', '"+occu+"', '"+pan+"', '"+aad+"', '"+sencit+"', '"+exacc+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup2(" ");
    }
}

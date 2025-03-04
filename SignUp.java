import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class SignUp extends JFrame implements ActionListener{

    JTextField textName, textFname, textEmail, textADD, textCity, textPinCode, textState;

    JButton next;

    JRadioButton r1, r2, m1, m2, m3;

    JDateChooser datechooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    SignUp(){
        super("APPLICATION FORM");
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 22));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(290,90,600,30);
        label3.setFont(new Font("Times New Roman", Font.BOLD, 22));
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setBounds(100,190,100,30);
        labelName.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Times New Roman", Font.BOLD, 14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelFname = new JLabel("Father's Name :");
        labelFname.setBounds(100,240,200,30);
        labelFname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(labelFname);

        textFname = new JTextField();
        textFname.setFont(new Font("Times New Roman", Font.BOLD, 14));
        textFname.setBounds(300,240,400,30);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setBounds(100,340 ,200,30);
        DOB.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(DOB);

        datechooser = new JDateChooser();
        datechooser.setForeground(new Color(105,105,105));
        datechooser.setBounds(300,340,120,30);
        add(datechooser);

        JLabel labelG = new JLabel("Gender :");
        labelG.setBounds(100,290 ,200,30);
        labelG.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        r1.setBackground(new Color(224, 227, 134));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        r2.setBackground(new Color(224, 227, 134));
        r2.setBounds(400,290,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setBounds(100,390 ,200,30);
        labelEmail.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Times New Roman", Font.BOLD, 14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMS = new JLabel("Marital Status :");
        labelMS.setBounds(100,440 ,200,30);
        labelMS.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(labelMS);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        m1.setBackground(new Color(224, 227, 134));
        m1.setBounds(300,440,100,30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        m2.setBackground(new Color(224, 227, 134));
        m2.setBounds(400,440,100,30);
        add(m2);

        m3 = new JRadioButton("Others");
        m3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        m3.setBackground(new Color(224, 227, 134));
        m3.setBounds(520,440,100,30);
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelADD = new JLabel("Address :");
        labelADD.setBounds(100,490 ,200,30);
        labelADD.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(labelADD);

        textADD = new JTextField();
        textADD.setFont(new Font("Times New Roman", Font.BOLD, 14));
        textADD.setBounds(300,490,400,30);
        add(textADD);

        JLabel labelState = new JLabel("State :");
        labelState.setBounds(100,540 ,200,30);
        labelState.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Times New Roman", Font.BOLD, 14));
        textState.setBounds(300,540,220,30);
        add(textState);

        JLabel labelCity = new JLabel("City :");
        labelCity.setBounds(100,590 ,200,30);
        labelCity.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Times New Roman", Font.BOLD, 14));
        textCity.setBounds(300,590,220,30);
        add(textCity);

        JLabel labelPinCode = new JLabel("Pin Code :");
        labelPinCode.setBounds(100,640 ,200,30);
        labelPinCode.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(labelPinCode);

        textPinCode = new JTextField();
        textPinCode.setFont(new Font("Times New Roman", Font.BOLD, 14));
        textPinCode.setBounds(300,640,100,30);
        add(textPinCode);

        next = new JButton("Next");
        next.setFont(new Font("Times New Roman", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(224, 227, 134));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()){
            gender = "Female";
        }
        String email = textEmail.getText();
        String ms = null;
        if(m1.isSelected()){
            ms = "Married";
        }else if(m2.isSelected()){
            ms = "Unmarried";
        }else if(m3.isSelected()){
            ms = "Others";
        }
        String add = textADD.getText();
        String state = textState.getText();
        String city = textCity.getText();
        String pincode = textPinCode.getText();

        try {
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the Fields");
            }else{
                ConDB con = new ConDB();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+ms+"','"+add+"','"+state+"','"+city+"','"+pincode+"')";
                con.statement.executeUpdate(q);
                new SignUp2(formno);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }    
    }
    public static void main(String[] args) {
        new SignUp();
    }
}

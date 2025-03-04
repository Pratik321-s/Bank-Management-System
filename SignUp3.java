import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class SignUp3 extends JFrame implements ActionListener{

    String formno;

    JButton s, c;

    JRadioButton r1, r2, r3, r4;

    JCheckBox c1, c2, c3, c4, c5, c6;

    SignUp3(String formno){

        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1 = new JLabel("Page 3 :-");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Times New Roman", Font.BOLD, 22));
        l2.setBounds(280, 70, 400, 40);
        add(l2);

        JLabel l3 = new JLabel("Account Type :");
        l3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l3.setBounds(100, 140, 200, 30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setBackground(new Color(222, 171, 113));
        r1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        r1.setBounds(100, 180, 150, 30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBackground(new Color(222, 171, 113));
        r2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        r2.setBounds(350, 180, 300, 30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBackground(new Color(222, 171, 113));
        r3.setFont(new Font("Times New Roman", Font.BOLD, 16));
        r3.setBounds(100, 220, 200, 30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBackground(new Color(222, 171, 113));
        r4.setFont(new Font("Times New Roman", Font.BOLD, 16));
        r4.setBounds(350, 220, 250, 30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number :");
        l4.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l4.setBounds(100, 300, 200, 30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-Digit Card Number)");
        l5.setFont(new Font("Times New Roman", Font.BOLD, 12));
        l5.setBounds(100, 330, 200, 20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4148");
        l6.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l6.setBounds(330, 300, 250, 30);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on ATM card/cheque Book and Statements)");
        l7.setFont(new Font("Times New Roman", Font.BOLD, 12));
        l7.setBounds(330, 330, 500, 20);
        add(l7);

        JLabel l8 = new JLabel("PIN :");
        l8.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l8.setBounds(100, 370, 200, 30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l9.setBounds(330, 370, 200, 30);
        add(l9);

        JLabel l10 = new JLabel("(4-Digit Password)");
        l10.setFont(new Font("Times New Roman", Font.BOLD, 12));
        l10.setBounds(100, 400, 200, 20);
        add(l10);

        JLabel l11 = new JLabel("Services Required :");
        l11.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l11.setBounds(100, 450, 200, 20);
        add(l11);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(new Color(222, 171, 113));
        c1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(222, 171, 113));
        c2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(222, 171, 113));
        c3.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setBackground(new Color(222, 171, 113));
        c4.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(222, 171, 113));
        c5.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(222, 171, 113));
        c6.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c6.setBounds(350,600,200,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by declares that the above entered details correct to the best of my knowledge.",true);
        c7.setBackground(new Color(222, 171, 113));
        c7.setFont(new Font("Times New Roman", Font.BOLD, 12));
        c7.setBounds(100,680,600,20);
        add(c7);

        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l12.setBounds(680,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Times New Roman", Font.BOLD, 14));
        l13.setBounds(760,10,100,30);
        add(l13);

        s = new JButton("Submit");
        s.setFont(new Font("Times New Roman", Font.BOLD, 14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(250,720,100,30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Times New Roman", Font.BOLD, 14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(420,720,100,30);
        c.addActionListener(this);
        add(c);

        setLayout(null);
        setSize(850,800);
        setLocation(400,20);
        getContentPane().setBackground(new Color(222, 171, 113));
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String AccType = "";
        if (r1.isSelected()) {
            AccType = "Saving Account";
        }else if (r2.isSelected()){
            AccType = "Fixed Deposit Account";
        }else if (r3.isSelected()) {
            AccType = "Current Account";
        }else if (r4.isSelected()) {
            AccType = "Recurring Deposit Account";  
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 14099630000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String services = "";
        if (c1.isSelected()) {
            services = services + "ATM Card";
        }else if (c2.isSelected()) {
            services = services + "Internet Banking";
        }else if (c3.isSelected()) {
            services = services + "Mobile Banking";
        }else if (c4.isSelected()) {
            services = services + "Email Alerts";
        }else if(c5.isSelected()){
            services = services + "Cheque Book";
        }else if (c6.isSelected()) {
            services = services + "E-Statement";
        }

        try {
            if (e.getSource()==s) {
                if (AccType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                }else{
                    ConDB c1 = new ConDB();
                    String q1 = "insert into signup3 values('"+formno+"','"+AccType+"','"+cardno+"','"+pin+"','"+services+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);

                    JOptionPane.showMessageDialog(null, "Card Numbe :r" + cardno + "\n Pin :" + pin);
                    new Deposit(pin);
                    setVisible(false);
                }
                }else if(e.getSource()==c){
                    System.exit(0);
            }
        } catch (Exception E) {
           E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp3("");
    }
}

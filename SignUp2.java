import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignUp2 extends JFrame implements ActionListener
{
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;

    JTextField textPAN, textAadhar;

    JButton next;

    JRadioButton r1, r2, a1, a2;

    String formno;

    SignUp2(String formno){

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Times New Roman", Font.BOLD, 22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {"Hindu","Muslim","Sikh","Christian","Buddhist","Others"}; 
        comboBox = new JComboBox<String>(religion);
        comboBox.setBackground(new Color(98,138,112));
        comboBox.setFont(new Font("Times New Roman",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String category[] = {"General","OBC","SC","ST","VJ","NT","Others"};
        comboBox2 = new JComboBox<String>(category);
        comboBox2.setBackground(new Color(98,138,112));
        comboBox2.setFont(new Font("Times New Roman",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income[] = {"NA","<150000","<250000","500000","Upto 1000000","Above 1000000"};
        comboBox3 = new JComboBox<String>(income);
        comboBox3.setBackground(new Color(98,138,112));
        comboBox3.setFont(new Font("Times New Roman",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l6.setBounds(100,270,120,30);
        add(l6);

        String educational[] = {"Non-Graduate","UG","PG","Dr","Others"};
        comboBox4 = new JComboBox<String>(educational);
        comboBox4.setBackground(new Color(98,138,112));
        comboBox4.setFont(new Font("Times New Roman",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l7.setBounds(100,320,120,30);
        add(l7);

        String occupation[] = {"Student","Corporate-Employee","Self-Employed","Business","Government-Employee","Retired","Others"};
        comboBox5 = new JComboBox<String>(occupation);
        comboBox5.setBackground(new Color(98,138,112));
        comboBox5.setFont(new Font("Times New Roman",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("AADHAR Number :");
        l8.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l8.setBounds(100,370,200,30);
        add(l8);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textAadhar.setBounds(350,370,200,30);
        add(textAadhar);

        JLabel l9 = new JLabel("PAN Number :");
        l9.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l9.setBounds(100,420,150,30);
        add(l9);

        textPAN = new JTextField();
        textPAN.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textPAN.setBounds(350,420,200,30);
        add(textPAN);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l10.setBounds(100,470,150,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        r1.setBackground(new Color(98,138,112));
        r1.setBounds(350,470,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        r2.setBackground(new Color(98,138,112));
        r2.setBounds(450,470,100,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Times New Roman", Font.BOLD, 18));
        l11.setBounds(100,520,150,30);
        add(l11);

        a1 = new JRadioButton("Yes");
        a1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        a1.setBackground(new Color(98,138,112));
        a1.setBounds(350,520,100,30);
        add(a1);

        a2 = new JRadioButton("No");
        a2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        a2.setBackground(new Color(98,138,112));
        a2.setBounds(450,520,100,30);
        add(a2);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(a1);
        buttonGroup2.add(a2);

        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Times New Roman", Font.BOLD, 14));
        l12.setBounds(680,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Times New Roman", Font.BOLD, 14));
        l13.setBounds(760,10,100,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Times New Roman", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(98,138,112));
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPAN.getText();
        String aadhar = textAadhar.getText();

        String scitizen = "";
        if (r1.isSelected()) {
            scitizen = "Yes";            
        }else if (r2.isSelected()) {
            scitizen = "No";
        }

        String eAccount = "";
        if (a1.isSelected()) {
            eAccount = "Yes";
        }else if (a2.isSelected()) {
            eAccount = "No";
        }

        try {
            if (textPAN.getText().equals("") || textAadhar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");               
            }else{
                ConDB c1 = new ConDB();
                String q = "insert into signup2 values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new SignUp3(formno);
                setVisible(false);
            }
        } catch (Exception E) {           
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
    new SignUp2("");
    }
}

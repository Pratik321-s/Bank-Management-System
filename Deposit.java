import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Deposit extends JFrame implements ActionListener{

    String pin;

    TextField textField;

    JButton b1, b2;
    
    Deposit(String pin){
        
        this.pin = pin; 

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSITE");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(460,180,400,35);
        l1.setForeground(Color.WHITE);
        image.add(l1);

        textField = new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,230,320,30);
        textField.setFont(new Font("Times New Roman", Font.BOLD, 22));
        image.add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        image.add(b2);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
        String amount = textField.getText();
        Date date = new Date(); 
        if (e.getSource()==b1) {
            if (textField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to Deposit");
            }else{
                ConDB c = new ConDB();
                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
                setVisible(false);
                new Main(pin); 
            }
        }else if (e.getSource()==b2) {
                setVisible(false);
                new Main(pin);
        }
        }catch(Exception E){
            E.printStackTrace();
        }  
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}

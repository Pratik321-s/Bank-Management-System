import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class ChangePin extends JFrame implements ActionListener{

    JButton b1, b2;

    JPasswordField p1, p2;

    String pin;
    
    ChangePin(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,830);
        add(image);

        JLabel l1 = new JLabel("CHANGE YOUR PIN");
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(430,180,400,35);
        l1.setForeground(Color.WHITE);
        image.add(l1);

        JLabel l2 = new JLabel("NEW PIN: ");
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setBounds(430,220,150,35);
        l2.setForeground(Color.WHITE);
        image.add(l2);

        p1 = new JPasswordField();
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.WHITE);
        p1.setBounds(600,220,180,25);
        p1.setFont(new Font("Times New Roman", Font.BOLD, 22));
        image.add(p1);

        JLabel l3 = new JLabel("RE-ENTER NEW PIN: ");
        l3.setFont(new Font("System", Font.BOLD, 16));
        l3.setBounds(430,250,400,35);
        l3.setForeground(Color.WHITE);
        image.add(l3);

        p2 = new JPasswordField();
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.WHITE);
        p2.setBounds(600,255,180,25);
        p2.setFont(new Font("Times New Roman", Font.BOLD, 22));
        image.add(p2);


        b1 = new JButton("CHANGE");
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
     
        try {
            String pin1 = p1.getText();
            String pin2 = p2.getText();
            
            if (!pin1.equals(pin2)) {
                JOptionPane.showMessageDialog(null, "Entered Pin does not matching");
                return;
            }
            if(e.getSource()==b1){
                if (p1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter New Pin");
                    return;
                }
                if (p2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Re-Enter New Pin");
                    return; 
                }

                ConDB c = new ConDB();
                String q1 = "update bank set pin = '"+pin1+"',where pin = '"+pin+"'";
                String q2 = "update login set pin = '"+pin1+"',where pin = '"+pin+"'";
                String q3 = "update signup3 set pin = '"+pin1+"',where pin = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Main(pin);

            }else if (e.getSource()==b2) {
                new Main(pin);
                setVisible(false);   
            }

        } catch (Exception E) {
            E.printStackTrace();
        }




    }

    public static void main(String[] args) {
        new ChangePin("");
    }
}

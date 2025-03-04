import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiniStatement extends JFrame implements ActionListener{

    String pin;

    JButton button;

    MiniStatement(String pin){

        this.pin = pin;

        getContentPane().setBackground(new Color(172, 118, 179));
        setLayout(null);
        setSize(400,600);
        setLocation(20,20);
        setUndecorated(true);

        JLabel l1 = new JLabel();
        l1.setBounds(20,140,400,200);
        add(l1);

        JLabel l2 = new JLabel("PRATIK KHARVE");
        l2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        l2.setBounds(150,20,200,20);
        add(l2);

        JLabel l3 = new JLabel();
        l3.setBounds(20,80,300,20);
        add(l3);

        JLabel l4 = new JLabel();
        l4.setBounds(20,400,300,20);
        add(l4);

        try {
            ConDB c =new ConDB();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while (resultSet.next()) {
                l3.setText("Card Number: "+ resultSet.getString("Card_Number").substring(0,4)+"XXXXXXXX"+resultSet.getString("Card_Number").substring(12));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int balance = 0;
            ConDB c = new ConDB();
            ResultSet resultSet = c.statement.executeQuery("select * from where pin = '"+pin+"'");
            while (resultSet.next()) {

                l1.setText(l1.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp"+resultSet.getString("amount")+"<br><br><html>");

                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else{
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                } 

                l4.setText("Your Total Balance is Rs "+balance);
        
            } 
        }catch (Exception e) {
            e.printStackTrace();
        }

        button = new JButton("EXIT");
        button.setBounds(20,500,100,25);
        button.addActionListener(this);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);        
    }

    public static void main(String[] args) {
        new MiniStatement("");
    }
}

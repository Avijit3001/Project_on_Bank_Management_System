
 package bank.management.project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener
{
    JButton backButton;
    String pinnumber;
    public BalanceEnquiry(String pinnumber) 
    {
        setTitle("Balance Enquiry");
        this.pinnumber = pinnumber;
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        //----------
        
        backButton = new JButton("Back");
        backButton.setFont(new Font("raleway",Font.BOLD,14));
        backButton.setBounds(355,520,150,30);
        backButton.addActionListener(this);
        image.add(backButton);
        
        //---------
        
            Conn c = new Conn();
            int balance = 0;
            try
            {
                ResultSet rs = c.s.executeQuery("select * from bank where pin_number = '"+pinnumber+"'");
                while(rs.next())
                {
                    if(rs.getString("type_of_transaction").equals("deposite"))
                    {
                        balance += Integer.parseInt(rs.getString("amount"));
                    }
                    else if(rs.getString("type_of_transaction").equals("Withdrawl"))
                    {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
                
        //---------
        
        JLabel text = new JLabel("Your account balance is: "+balance);
        text.setFont(new Font("Osword",Font.BOLD,16));
        text.setForeground(Color.white);
        text.setBounds(200,300,700,35);
        image.add(text);
        
        
        getContentPane().setBackground(Color.white);
        setSize(900,900);
        setLocation(300,0);
 //       setUndecorated(true);
        setVisible(true);
        
    }
    
    public static void main(String[] args) 
    {
        new BalanceEnquiry("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {      
        if(ae.getSource() == backButton)
        {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
}




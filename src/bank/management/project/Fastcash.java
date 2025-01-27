package bank.management.project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class Fastcash extends JFrame implements ActionListener
{
    JButton hundredButton,fivehundredButton,onethousandButton,twothousandButton,fivethousandButton,tenthousandButton,backButton;
    String pinnumber;
    public Fastcash(String pinnumber) 
    {
        setTitle("Transaction");
        this.pinnumber = pinnumber;
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        //---------
        
        JLabel text = new JLabel("Select Withdral Amount");
        text.setFont(new Font("Osword",Font.BOLD,16));
        text.setForeground(Color.white);
        text.setBounds(230,300,700,35);
        image.add(text);
        
        //------------
        
        hundredButton = new JButton("Rs 100");
        hundredButton.setFont(new Font("raleway",Font.BOLD,14));
        hundredButton.setBounds(170,415,150,30);
        hundredButton.addActionListener(this);
        image.add(hundredButton);
        
        //---------
        
        twothousandButton = new JButton("Rs 2000");
        twothousandButton.setFont(new Font("raleway",Font.BOLD,14));
        twothousandButton.setBounds(355,415,150,30);
        twothousandButton.addActionListener(this);
        image.add(twothousandButton);
        
        //-----------
        
        fivehundredButton = new JButton("Rs 500");
        fivehundredButton.setFont(new Font("raleway",Font.BOLD,14));
        fivehundredButton.setBounds(170,450,150,30);
        fivehundredButton.addActionListener(this);
        image.add(fivehundredButton);
        
        //---------
        
        fivethousandButton = new JButton("Rs 5000");
        fivethousandButton.setFont(new Font("raleway",Font.BOLD,14));
        fivethousandButton.setBounds(355,450,150,30);
        fivethousandButton.addActionListener(this);
        image.add(fivethousandButton);
        
        //---------
        
        onethousandButton = new JButton("Rs 1000");
        onethousandButton.setFont(new Font("raleway",Font.BOLD,14));
        onethousandButton.setBounds(170,485,150,30);
        onethousandButton.addActionListener(this);
        image.add(onethousandButton);
        
        //---------
        
        tenthousandButton = new JButton("Rs 10000");
        tenthousandButton.setFont(new Font("raleway",Font.BOLD,14));
        tenthousandButton.setBounds(355,485,150,30);
        tenthousandButton.addActionListener(this);
        image.add(tenthousandButton);
        
        //--------
        
        backButton = new JButton("Back");
        backButton.setFont(new Font("raleway",Font.BOLD,14));
        backButton.setBounds(355,520,150,30);
        backButton.addActionListener(this);
        image.add(backButton);
        
        //---------
        
        getContentPane().setBackground(Color.white);
        setSize(900,900);
        setLocation(300,0);
 //       setUndecorated(true);
        setVisible(true);
        
    }
    
    public static void main(String[] args) 
    {
        new Fastcash("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource() == backButton)
        {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        else
        {
            String amount = ((JButton)ae.getSource()).getText().substring(3);
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
                    else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                System.out.println(balance);
                System.out.println(amount);
                if(ae.getSource() != backButton && balance < Integer.parseInt(amount))
                {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+amount+" is Debited Successfully");
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }
        
    }
}



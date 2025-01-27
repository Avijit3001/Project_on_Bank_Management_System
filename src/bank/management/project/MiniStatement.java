package bank.management.project;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import  java.sql.*;

public class MiniStatement extends JFrame implements ActionListener
{
    String pinnumber;
    public MiniStatement(String pinnumber)
    {
        setTitle("MINI STATEMENT");
        this.pinnumber = pinnumber;
        setLayout(null);
        
                
        JLabel bank = new JLabel("Indian Bank");
        bank.setFont(new Font("raleway",Font.BOLD,20));
        bank.setBounds(150, 20, 150, 30);
        add(bank);
                        
        JLabel cardnumber = new JLabel();
        cardnumber.setFont(new Font("raleway",Font.BOLD,12));
        cardnumber.setBounds(20, 90, 500, 30);
        add(cardnumber);
        
        JLabel mini = new JLabel();
        mini.setFont(new Font("raleway",Font.BOLD,12));
        mini.setBounds(20, 90, 400, 300);
        add(mini);
        
        JLabel TotBalanceJLabel = new JLabel();
        TotBalanceJLabel.setFont(new Font("raleway",Font.BOLD,12));
        TotBalanceJLabel.setBounds(20, 350, 300, 30);
        add(TotBalanceJLabel);
        
        
            int balance = 0;
            try
            {
                Conn c = new Conn();
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
                TotBalanceJLabel.setText("Your current Account Balance is: "+balance);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        
        //------------
        
        try 
        {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from login where pin_number = '"+pinnumber+"'");
            
            while (rs.next()) 
            {                
                cardnumber.setText("Card Number: XXXX-XXXX-XXXX- "+rs.getString("card_number").substring(12));
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        //------------
        
        try 
        {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bank where pin_number = '"+pinnumber+"'");
            
            while (rs.next()) 
            {                
                mini.setText(mini.getText() + "<html>" + rs.getString("date_of_deposit")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("Type_of_Transaction")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");                                       
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        
        //-----------
        getContentPane().setBackground(Color.white);
        setSize(400,600);
        setLocation(20,20);
   //     setUndecorated(true);
        setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        new MiniStatement("");
    }
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        
    }
}

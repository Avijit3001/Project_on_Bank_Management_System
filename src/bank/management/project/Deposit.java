
package bank.management.project;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class Deposit extends JFrame implements ActionListener
{
    JTextField amountTextField;
    JButton depositButton,backButton;
    String pinnumber;
    public Deposit(String pinnumber) 
    {
            setTitle("TRANSACTION");
        this.pinnumber = pinnumber;
        
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        //--------------
        
        JLabel text = new JLabel("Enter The Amount you want to deposit");
        text.setFont(new Font("Osword",Font.BOLD,16));
        text.setForeground(Color.white);
        text.setBounds(185,300,700,35);
        image.add(text);
        
        //--------------
        
        amountTextField = new JTextField();
        amountTextField.setBounds(210,350,250,25);
        amountTextField.setFont(new Font("Arial",Font.BOLD,22));
        add(amountTextField);
        
        //--------------
        
        depositButton = new JButton("Deposit");
        depositButton.setFont(new Font("raleway",Font.BOLD,14));
        depositButton.setBounds(355,485,150,30);
        depositButton.addActionListener(this);
        image.add(depositButton);
        
        //--------------
        
        backButton = new JButton("Back");
        backButton.setFont(new Font("raleway",Font.BOLD,14));
        backButton.setBounds(355,520,150,30);
        backButton.addActionListener(this);
        image.add(backButton);
        
        //----------------
        
        getContentPane().setBackground(Color.white);
        setSize(900,900);
        setLocation(300,0);
 //       setUndecorated(true);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Deposit("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource() == depositButton)
        {
            String amount = amountTextField.getText();
            Date date = new Date();
            if(amount.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit.");
            }
            else{
                try{
                    Conn c = new Conn();
                    String quary = "insert into bank values('"+pinnumber+"', '"+date+"', 'deposite', '"+amount+"')";
                    c.s.executeUpdate(quary);
                    JOptionPane.showMessageDialog(null, "Rs "+amount+" deposited successsfully.");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            
        }
        else if(ae.getSource() == backButton)
        { 
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
} 

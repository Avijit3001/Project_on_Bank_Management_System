
package bank.management.project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener
{
    JButton depositButton,withdrawlButton,fastcashButton,ministatementButton,pinchangeButton,balanceenquiryButton,exitButton;
    String pinnumber;
    public Transactions(String pinnumber) 
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
        
        JLabel text = new JLabel("Please Select your Transaction");
        text.setFont(new Font("Osword",Font.BOLD,16));
        text.setForeground(Color.white);
        text.setBounds(230,300,700,35);
        image.add(text);
        
        //------------
        
        depositButton = new JButton("Deposit");
 //       depositButton.setBackground(Color.black);
 //       depositButton.setForeground(Color.white);
        depositButton.setFont(new Font("raleway",Font.BOLD,14));
        depositButton.setBounds(170,415,150,30);
        depositButton.addActionListener(this);
        image.add(depositButton);
        
        //---------
        
        withdrawlButton = new JButton("Cash Withdrawl");
        withdrawlButton.setFont(new Font("raleway",Font.BOLD,14));
        withdrawlButton.setBounds(355,415,150,30);
        withdrawlButton.addActionListener(this);
        image.add(withdrawlButton);
        
        //-----------
        
        fastcashButton = new JButton("Fast Cash");
        fastcashButton.setFont(new Font("raleway",Font.BOLD,14));
        fastcashButton.setBounds(170,450,150,30);
        fastcashButton.addActionListener(this);
        image.add(fastcashButton);
        
        //---------
        
        ministatementButton = new JButton("Mini Statement");
        ministatementButton.setFont(new Font("raleway",Font.BOLD,14));
        ministatementButton.setBounds(355,450,150,30);
        ministatementButton.addActionListener(this);
        image.add(ministatementButton);
        
        //---------
        
        pinchangeButton = new JButton("Pin Change");
        pinchangeButton.setFont(new Font("raleway",Font.BOLD,14));
        pinchangeButton.setBounds(170,485,150,30);
        pinchangeButton.addActionListener(this);
        image.add(pinchangeButton);
        
        //---------
        
        balanceenquiryButton = new JButton("Balance Enquiry");
        balanceenquiryButton.setFont(new Font("raleway",Font.BOLD,14));
        balanceenquiryButton.setBounds(355,485,150,30);
        balanceenquiryButton.addActionListener(this);
        image.add(balanceenquiryButton);
        
        //--------
        
        exitButton = new JButton("Exit");
        exitButton.setFont(new Font("raleway",Font.BOLD,14));
        exitButton.setBounds(355,520,150,30);
        exitButton.addActionListener(this);
        image.add(exitButton);
        
        //---------
        
        getContentPane().setBackground(Color.white);
        setSize(900,900);
        setLocation(300,0);
 //       setUndecorated(true);
        setVisible(true);
        
    }
    
    public static void main(String[] args) 
    {
        new Transactions("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource() == exitButton)
        {
            System.exit(0);
        }
        else if(ae.getSource() == depositButton)
        {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == withdrawlButton)
        {
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == fastcashButton)
        {
            setVisible(false);
            new Fastcash(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == pinchangeButton)
        {
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == balanceenquiryButton)
        {
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == ministatementButton)
        {
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
}

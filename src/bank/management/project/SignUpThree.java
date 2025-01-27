
package bank.management.project;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignUpThree extends JFrame implements ActionListener
{
    int count = 0;
    JLabel typeJLabel,cardNoJLabel,cardDigitJLabel,pinJLabel,pinDigitJLabel,servicesJLabel;
    JRadioButton savingsButton,fixedButton,currentButton,recurriengButton;
    JButton submitButton,cancelButton;
    JCheckBox atmBox,mBankingBox,checkbookBox,iBankingBox,emailBox,eStatementBox,noticeBox;
    String formno = null;
    
    public SignUpThree(String formno) 
    {
        setLayout(null);
        
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FROM - Page 3");
                
        JLabel accountJLabel = new JLabel("Page 3: Account Details");
        accountJLabel.setFont(new Font("raleway",Font.BOLD,20));
        accountJLabel.setBounds(300,30,400,40);
        add(accountJLabel);
        
        //------------
        
        typeJLabel = new JLabel("Account Type:");
        typeJLabel.setFont(new Font("raleway",Font.BOLD,20));
        typeJLabel.setBounds(100,110,200,30);
        add(typeJLabel);
        
        savingsButton = new JRadioButton("Savings Account");
        savingsButton.setFont(new Font("raleway",Font.BOLD,15));
        savingsButton.setBounds(100,145,200,30);
        savingsButton.setBackground(Color.white);
        add(savingsButton);
        
        fixedButton = new JRadioButton("Fixed Deposit Account");
        fixedButton.setFont(new Font("raleway",Font.BOLD,15));
        fixedButton.setBounds(350,145,250,30);
        fixedButton.setBackground(Color.white);
        add(fixedButton);
        
        currentButton = new JRadioButton("Current Account");
        currentButton.setFont(new Font("raleway",Font.BOLD,15));
        currentButton.setBounds(100,185,200,30);
        currentButton.setBackground(Color.white);
        add(currentButton);
        
        recurriengButton = new JRadioButton("Recurrieng Deposit Account");
        recurriengButton.setFont(new Font("raleway",Font.BOLD,15 ));
        recurriengButton.setBounds(350,185,250,30);
        recurriengButton.setBackground(Color.white);
        add(recurriengButton);
        
        ButtonGroup accountTypeGroup = new ButtonGroup();
        accountTypeGroup.add(savingsButton);
        accountTypeGroup.add(fixedButton);
        accountTypeGroup.add(currentButton);
        accountTypeGroup.add(recurriengButton);
        
        //--------------
        
        cardNoJLabel = new JLabel("Card Number");
        cardNoJLabel.setFont(new Font("raleway",Font.BOLD,20));
        cardNoJLabel.setBounds(100,260,200,30);
        add(cardNoJLabel);
        
        cardDigitJLabel = new JLabel("Your 16 Digit Card Number");
        cardDigitJLabel.setFont(new Font("raleway",Font.BOLD,10));
        cardDigitJLabel.setBounds(100,280,200,30);
        add(cardDigitJLabel);
        
        cardNoJLabel = new JLabel("XXXX-XXXX-XXXX-2354");
        cardNoJLabel.setFont(new Font("raleway",Font.BOLD,20));
        cardNoJLabel.setBounds(340,260,400,30);
        add(cardNoJLabel);
        
        //--------------
        
        pinJLabel = new JLabel("PIN");
        pinJLabel.setFont(new Font("raleway",Font.BOLD,20));
        pinJLabel.setBounds(100,330,200,30);
        add(pinJLabel);
        
        pinJLabel = new JLabel("Your 4 Digit Password");
        pinJLabel.setFont(new Font("raleway",Font.BOLD,10));
        pinJLabel.setBounds(100,350,200,30);
        add(pinJLabel);
        
        pinDigitJLabel = new JLabel("XXXX");
        pinDigitJLabel.setFont(new Font("raleway",Font.BOLD,20));
        pinDigitJLabel.setBounds(340,320,200,30);
        add(pinDigitJLabel);
        
        //-----------
        
        servicesJLabel = new JLabel("Services Required:");
        servicesJLabel.setFont(new Font("raleway",Font.BOLD,20));
        servicesJLabel.setBounds(100,420,200,30);
        add(servicesJLabel);
        
        atmBox = new JCheckBox("ATM Card");
        atmBox.setFont(new Font("raleway",Font.BOLD,15));
        atmBox.setBounds(100,460,200,30);
        atmBox.setBackground(Color.white);
        add(atmBox);
        
        mBankingBox = new JCheckBox("Mobile Banking");
        mBankingBox.setFont(new Font("raleway",Font.BOLD,15));
        mBankingBox.setBounds(100,510,200,30);
        mBankingBox.setBackground(Color.white);
        add(mBankingBox);
        
        checkbookBox = new JCheckBox("Check Book");
        checkbookBox.setFont(new Font("raleway",Font.BOLD,15));
        checkbookBox.setBounds(100,560,200,30);
        checkbookBox.setBackground(Color.white);
        add(checkbookBox);
        
        iBankingBox = new JCheckBox("Internet Banking");
        iBankingBox.setFont(new Font("raleway",Font.BOLD,15));
        iBankingBox.setBounds(350,460,200,30);
        iBankingBox.setBackground(Color.white);
        add(iBankingBox);
        
        emailBox = new JCheckBox("Email & SMS Alerts");
        emailBox.setFont(new Font("raleway",Font.BOLD,15));
        emailBox.setBounds(350,510,200,30);
        emailBox.setBackground(Color.white);
        add(emailBox);
        
        eStatementBox = new JCheckBox("E-Statement");
        eStatementBox.setFont(new Font("raleway",Font.BOLD,15));
        eStatementBox.setBounds(350,560,200,30);
        eStatementBox.setBackground(Color.white);
        add(eStatementBox);
        
        //--------------
        
        noticeBox = new JCheckBox("I hearby declares that the above entered detailes are correct to the best of my konowledge.");
        noticeBox.setFont(new Font("raleway",Font.BOLD,12));
        noticeBox.setBounds(100,650,700,30);
        noticeBox.setBackground(Color.white);
        add(noticeBox);
        
        //--------------
        
        submitButton = new JButton("Submit");
        submitButton.setBackground(Color.black);
        submitButton.setForeground(Color.white);
        submitButton.setFont(new Font("raleway",Font.BOLD,14));
        submitButton.setBounds(210,690,100,30);
        submitButton.addActionListener(this);
        add(submitButton);
        
        cancelButton = new JButton("Cancel");
        cancelButton.setBackground(Color.black);
        cancelButton.setForeground(Color.white);
        cancelButton.setFont(new Font("raleway",Font.BOLD,14));
        cancelButton.setBounds(390,690,100,30);
        cancelButton.addActionListener(this);
        add(cancelButton);
        
        
        getContentPane().setBackground(Color.white);
        setSize(770,800);
        setLocation(350,0);
        setVisible(true);
        
    }
    
    public static void main(String[] args)
    {
        new SignUpThree("");
                
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource() == submitButton)
        {
            String accountType = "";
            if(savingsButton.isSelected())
            {
                accountType = "Savings Account";
            }
            else if(fixedButton.isSelected())
            {
                accountType = "Fixed Deposit Account";
            }
            else if(currentButton.isSelected())
            {
                accountType = "Current Account";
            }
            else if(recurriengButton.isSelected())
            {
                accountType = "Recurrieng Deposit Account";
            }
            
            //------------
            
            Random random = new Random();
            String cardNo  = "" + Math.abs((random.nextLong() % 90000000L)+5040936000000000L);
            
            String pinNo = ""+Math.abs((random.nextLong() % 9000L)+1000L);
            
            // Services Required -----
            
            String sATMcard = "";
            if(atmBox.isSelected())
            {
                sATMcard = "ATM CARD";
            }
            
            // -----------
            
            String sMbanking = "";
            if(mBankingBox.isSelected())
            {
                sMbanking = "Mobile Banking";
            }
            
            // -----------
            
            String sCheckbook = "";
            if(checkbookBox.isSelected())
            {
                sCheckbook = "Check Book";
            }
            
            //-----------
            
            String sIbanking = "";
            if(iBankingBox.isSelected())
            {
                sIbanking = "Internet Banking";
            }
            //-----------
            String sEmail = "";
            if(emailBox.isSelected())
            {
                sEmail = "EMAIL & SMS Alert";
            }
            //-------------
            String sEstatement = "";
            if(eStatementBox.isSelected())
            {
                sEstatement = "E-Statement";
            }
            
            //-----------
            
   
            
             try{
                if(accountType.equals(""))
                {
                    count++;
                    JOptionPane.showMessageDialog(null, "Account Type is Required..");
                }
                else if(!atmBox.isSelected())
                {
                    count++;
                    JOptionPane.showMessageDialog(null, "ATM Card is Mendatory for all..");
                }
                else if(!noticeBox.isSelected())
                {
                    count++;
                    JOptionPane.showMessageDialog(null, "Please Check The notice..");
                }
               
                if(ae.getSource() == submitButton)
                {
                    if(count == 0)
                    {
                        Conn c = new Conn();
                        String query1 = "insert into signupThree values('"+formno+"', '"+accountType+"', '"+cardNo+"', '"+pinNo+"', '"+sATMcard+"', '"+sMbanking+"', '"+sCheckbook+"', '"+sIbanking+"', '"+sEmail+"', '"+sEstatement+"')";        
                        String query2 = "insert into login values('"+formno+"', '"+cardNo+"', '"+pinNo+"')";        

                        c.s.execute(query1);
                        c.s.execute(query2);
     
                        JOptionPane.showMessageDialog(null, "     Card Number: "+cardNo+"\n      Pin Number: "+pinNo+"\nPlease note card Number and pin number");
                        setVisible(false);
                        new Deposit(pinNo).setVisible(true);
                    }
                    else{
                        count=0;
                        setVisible(true);
                    }
                }
                else if(ae.getSource() == cancelButton)
                {
                    setVisible(false);
                    new Login().setVisible(true);
                }
                
               
            }
            catch(Exception excep){
                System.out.println(excep); 
            }
           
        }
       
    }
}

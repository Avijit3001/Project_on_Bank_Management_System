 package bank.management.project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener
{
    JButton changeButton,backButton;
    JPasswordField pinField,reEnterField;
    String pinnumber,pinNo;
    public PinChange(String pinnumber) 
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
        
        JLabel text = new JLabel("Change Your Pin");
        text.setFont(new Font("Osword",Font.BOLD,16));
        text.setForeground(Color.white);
        text.setBounds(260,300,700,35);
        image.add(text);
        
        //------------
        
        JLabel pinJLabel = new JLabel("New Pin:");
        pinJLabel.setFont(new Font("Osword",Font.BOLD,16));
        pinJLabel.setForeground(Color.white);
        pinJLabel.setBounds(175,350,180,25);
        image.add(pinJLabel);
        
        pinField = new JPasswordField();
        pinField.setBounds(340,350,150,25);
        pinField.setFont(new Font("Arial",Font.BOLD,22));
        pinField.addActionListener(this);
        add(pinField);
        
        //----------
        
        JLabel ReEnterpinJLabel = new JLabel("Re-Enter New Pin:");
        ReEnterpinJLabel.setFont(new Font("Osword",Font.BOLD,16));
        ReEnterpinJLabel.setForeground(Color.white);
        ReEnterpinJLabel.setBounds(175,380,180,25);
        image.add(ReEnterpinJLabel);
        
        reEnterField = new JPasswordField();
        reEnterField.setBounds(340,380,150,25);
        reEnterField.setFont(new Font("Arial",Font.BOLD,22));
        reEnterField.addActionListener(this);
        add(reEnterField);
        
        //-----------
         
        changeButton = new JButton("Change");
        changeButton.setFont(new Font("raleway",Font.BOLD,14));
        changeButton.setBounds(355,485,150,30);
        changeButton.addActionListener(this);
        image.add(changeButton);
        
        //--------------
        
        backButton = new JButton("Back");
        backButton.setFont(new Font("raleway",Font.BOLD,14));
        backButton.setBounds(355,520,150,30);
        backButton.addActionListener(this);
        image.add(backButton);
        
        
        
        getContentPane().setBackground(Color.white);
        setSize(900,900);
        setLocation(300,0);
 //       setUndecorated(true);
        setVisible(true);
        
    }
    
    public static void main(String[] args) 
    {
        new PinChange("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        
        if(ae.getSource() == changeButton)
        {
            try
            {
                String npin = pinField.getText();
                String repin = reEnterField.getText();
                if(npin.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Entere new PIN");
                    return;
                }
                if(repin.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Re-Entere new PIN");
                    return;
                }
                if(!npin.equals(repin))
                {
                    JOptionPane.showMessageDialog(null, "Entered PIN Does not match");
                    return;
                }
                
                Conn c = new Conn();
                String query1 = "update bank set pin_number = '"+repin+"' where pin_number = '"+pinnumber+"'";
                String query2 = "update login set pin_number = '"+repin+"' where pin_number = '"+pinnumber+"'";
                String query3 = "update signupthree set pin_number = '"+repin+"' where pin_number = '"+pinnumber+"'";
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                c.s.executeUpdate(query3);
                pinNo = repin;
                JOptionPane.showMessageDialog(null, "PIN is changed Successfully");
                setVisible(false);
                new Transactions(repin).setVisible(true);
                        
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }
        if(ae.getSource() == backButton)
        {
            setVisible(false);
            new Transactions(pinNo).setVisible(true);
        }
    }
}



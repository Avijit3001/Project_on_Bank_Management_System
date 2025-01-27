
package bank.management.project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener
{
    JButton clear,signup,login;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login()
    {
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
       
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osword",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel cardNo = new JLabel("Card Number: ");
        cardNo.setFont(new Font("Osword",Font.BOLD,28));
        cardNo.setBounds(120,150,400,40);
        add(cardNo);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(320,160,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        JLabel pinNo = new JLabel("Pin: ");
        pinNo.setFont(new Font("Osword",Font.BOLD,28));
        pinNo.setBounds(120,220,400,40);
        add(pinNo);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(320,230,230,30);
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(320,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);        
        
        clear = new JButton("CLEAR");
        clear.setBounds(450,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(320,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.white);
        setSize(800,500);
        setLocation(350,200);
        setVisible(true);
        
        
    } 
    public static void main(String[] args)
    {
        new Login();           
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource() == clear)
        {
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource() ==  login)
        {
            Conn c = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where card_number = '"+cardnumber+"' and pin_number = '"+pinnumber+"'";
            try
            {
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next())
                {
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else if(ae.getSource() ==  signup)
        {
            setVisible(false);
            new SignUpOne().setVisible(true);
        }
    }
}

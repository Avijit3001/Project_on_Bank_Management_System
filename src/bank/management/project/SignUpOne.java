
package bank.management.project;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;


public class SignUpOne extends JFrame implements ActionListener
{
    Long random;
    int count=0;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
    JDateChooser dobTextField;
    JRadioButton male, female, married, unmarried, others;
    JButton next;
            
    SignUpOne()
    {
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L)+1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO.  "+random);
        formno.setFont(new Font("raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel persondetails = new JLabel("Page 1: Personal Details");
        persondetails.setFont(new Font("raleway",Font.BOLD,20));
        persondetails.setBounds(290,70,400,30);
        add(persondetails);
        
        //-----------
        
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setBounds(300,140,400,30);
        nameTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(nameTextField);
        
        // -----------
        
        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("raleway",Font.BOLD,20));
        fname.setBounds(100,190,150,30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setBounds(300,190,400,30);
        fnameTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(fnameTextField);
        
        // ------------
        
        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dobTextField = new JDateChooser();
        dobTextField.setBounds(300,240,400,30);
        dobTextField.setForeground(Color.black);
        dobTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(dobTextField);
        
        // ------------
        
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setFont(new Font("raleway",Font.BOLD,16));
        male.setBounds(300,290,100,30);
        male.setBackground(Color.white);
        add(male);
        
        female = new JRadioButton("Female");
        female.setFont(new Font("raleway",Font.BOLD,16 ));
        female.setBounds(450,290,100,30);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        // --------------
        
        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("raleway",Font.BOLD,20));
        email.setBounds(100,340,150,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setBounds(300,340,400,30);
        emailTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(emailTextField);
        
        // --------------
        
        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("raleway",Font.BOLD,20));
        marital.setBounds(100,390,150,30);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setFont(new Font("raleway",Font.BOLD,16));
        married.setBounds(300,390,100,30);
        married.setBackground(Color.white);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setFont(new Font("raleway",Font.BOLD,16));
        unmarried.setBounds(450,390,150,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        others = new JRadioButton("Others");
        others.setFont(new Font("raleway",Font.BOLD,16));
        others.setBounds(620,390,100,30);
        others.setBackground(Color.white);
        add(others);
        
        ButtonGroup maritalStatus = new ButtonGroup();
        maritalStatus.add(married);
        maritalStatus.add(unmarried);
        maritalStatus.add(others);
        
        // --------------
        
        JLabel address = new JLabel("Adderss: ");
        address.setFont(new Font("raleway",Font.BOLD,20));
        address.setBounds(100,440,150,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setBounds(300,440,400,30);
        addressTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(addressTextField);
        
        // --------------
        
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("raleway",Font.BOLD,20));
        city.setBounds(100,490,150,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setBounds(300,490,400,30);
        cityTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cityTextField);
        
        // ----------------
        
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("raleway",Font.BOLD,20));
        state.setBounds(100,540,150,30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setBounds(300,540,400,30);
        stateTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(stateTextField);
        
        //-------------
        
        JLabel pincode = new JLabel("Pin Code: ");
        pincode.setFont(new Font("raleway",Font.BOLD,20));
        pincode.setBounds(100,590,150,30);
        add(pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setBounds(300,590,400,30);
        pincodeTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pincodeTextField);
        
        // ------------
        
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("raleway",Font.BOLD,14));
        next.setBounds(400,690,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
    }
    public static void main(String[] args)
    {
        new SignUpOne();
                
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String formno = "" + random ;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ""+((JTextField)dobTextField.getDateEditor().getUiComponent()).getText();
        
        String gender = null;
        if(male.isSelected())
        {
            gender = "Male";
        }
        else if(female.isSelected())
        {
            gender = "Female";
        }
       
        String email = emailTextField.getText();
        
        String marital = null;
        if(married.isSelected())
        {
            marital = "Married";
        }
        else if(unmarried.isSelected())
        {
            marital = "Unmarried";
        }
        else if(others.isSelected())
        {
            marital = "Others";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pincodeTextField.getText();
        
        try{
                if(name.equals(""))
                {
                    count++;
                    JOptionPane.showMessageDialog(null, "Name is Required..");
                }
                else if(dob.equals(""))
                {
                    count++;
                    JOptionPane.showMessageDialog(null, "Date of birth is Required..");
                }
                else if(pin.equals(""))
                {
                    count++;
                    JOptionPane.showMessageDialog(null, "PIN Code is Required..");
                }
                
            
                if(ae.getSource() == next)
                {
                    if(count == 0)
                    {
                        Conn c = new Conn();
                        String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";        
                        c.s.execute(query);
                        
                        setVisible(false);
                        new SignUpTwo(formno).setVisible(true); 
                    }
                    else{
                        count=0;
                        setVisible(true);
                    }
                }
                
        }
        catch(Exception excep){
            System.out.println(excep); 
        }
           
    }
}

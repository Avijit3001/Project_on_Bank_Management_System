
package bank.management.project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener
{
    int count=0;
    JTextField panTextField,aadharTextField;
    JRadioButton Syes,Sno,Edyes,Edno;
    JButton next;
    JComboBox religionComboBox,categoryComboBox,qualificationComboBox,occupationComboBox,incomeComboBox;
    String formno = null;
    SignUpTwo(String formno)
    {
        setLayout(null);
        
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FROM - Page 2");
                
        JLabel additionaldetails = new JLabel("Page 2: Additional Details");
        additionaldetails.setFont(new Font("raleway",Font.BOLD,20));
        additionaldetails.setBounds(290,50,400,30);
        add(additionaldetails);
        
        //-----------
        
        JLabel religion = new JLabel("Religion: ");
        religion.setFont(new Font("raleway",Font.BOLD,20));
        religion.setBounds(100,140,100,30);
        add(religion);
        
        String valReligion[] = {"Hindu", "Muslim","Sikh", "Chistian", "Others"};
        religionComboBox = new JComboBox(valReligion);        
        religionComboBox.setBounds(300,140,400,30);
        religionComboBox.setFont(new Font("Arial",Font.BOLD,14));
        religionComboBox.setBackground(Color.white);
        add(religionComboBox);
        
        // -----------
        
        JLabel category = new JLabel("Category: ");
        category.setFont(new Font("raleway",Font.BOLD,20));
        category.setBounds(100,190,150,30);
        add(category);
        
        String valCategory[] = {"General","OBC","SC","ST","OTHER"};
        categoryComboBox = new JComboBox(valCategory);
        categoryComboBox.setBounds(300,190,400,30);
        categoryComboBox.setFont(new Font("Arial",Font.BOLD,14));
        categoryComboBox.setBackground(Color.white);
        add(categoryComboBox);
        
        // ------------
        
        JLabel income = new JLabel("Anual Income: ");
        income.setFont(new Font("raleway",Font.BOLD,20));
        income.setBounds(100,240,200,30);
        add(income);
        
        String valIncome[] = {"null","< 1,50,000","< 2,50,000","< 3,50,000","< 5,00,000","< 8,00,000","< 10,00,000","more than 10 Lakhs"};
        incomeComboBox = new JComboBox(valIncome);
        incomeComboBox.setBounds(300,240,400,30);
        incomeComboBox.setFont(new Font("Arial",Font.BOLD,14));
        incomeComboBox.setBackground(Color.white);
        add(incomeComboBox);
                
        // ------------
        
        JLabel educational = new JLabel("Educational ");
        educational.setFont(new Font("raleway",Font.BOLD,20));
        educational.setBounds(100,290,200,30);
        add(educational);
        
        JLabel qualification = new JLabel("Qualification: ");
        qualification.setFont(new Font("raleway",Font.BOLD,20));
        qualification.setBounds(100,310,200,30);
        add(qualification);
        
        String valQualification[] = {"Secondary","Higher Secondary","Graduate","post-Graduate","Diploma","B-Tech","Doctorate","others"};
        qualificationComboBox = new JComboBox(valQualification);
        qualificationComboBox.setBounds(300,310,400,30);
        qualificationComboBox.setFont(new Font("Arial",Font.BOLD,14));
        qualificationComboBox.setBackground(Color.white);
        add(qualificationComboBox);
                
        // --------------
        
        JLabel occupation = new JLabel("Occupation: ");
        occupation.setFont(new Font("raleway",Font.BOLD,20));
        occupation.setBounds(100,360,150,30);
        add(occupation);
        
        String valOccupation[] = {"Salaried","Self-Employed","Business","Student","Retired","Others"};
        occupationComboBox = new JComboBox(valOccupation);
        occupationComboBox.setBounds(300,360,400,30);
        occupationComboBox.setFont(new Font("Arial",Font.BOLD,14));
        occupationComboBox.setBackground(Color.white);
        add(occupationComboBox);
        
        // --------------
        
        JLabel pan = new JLabel("PAN Number: ");
        pan.setFont(new Font("raleway",Font.BOLD,20));
        pan.setBounds(100,410,200,30);
        add(pan);
        
        panTextField = new JTextField();
        panTextField.setBounds(300,410,400,30);
        panTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(panTextField);

        // --------------
        
        JLabel aadhar = new JLabel("Aadhar Number: ");
        aadhar.setFont(new Font("raleway",Font.BOLD,20));
        aadhar.setBounds(100,460,200,30);
        add(aadhar);
        
        aadharTextField = new JTextField();
        aadharTextField.setBounds(300,460,400,30);
        aadharTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(aadharTextField);
        
        // --------------
        
        JLabel seniorcitizen = new JLabel("Senior citizen: ");
        seniorcitizen.setFont(new Font("raleway",Font.BOLD,20));
        seniorcitizen.setBounds(100,510,250,30);
        add(seniorcitizen);
        
        Syes = new JRadioButton("Yes");
        Syes.setFont(new Font("raleway",Font.BOLD,16));
        Syes.setBounds(300,510,100,30);
        Syes.setBackground(Color.white);
        add(Syes);
        
        Sno = new JRadioButton("No");
        Sno.setFont(new Font("raleway",Font.BOLD,16 ));
        Sno.setBounds(450,510,100,30);
        Sno.setBackground(Color.white);
        add(Sno);
        
        ButtonGroup seniorcitizenGroup = new ButtonGroup();
        seniorcitizenGroup.add(Syes);
        seniorcitizenGroup.add(Sno);
        
        // ----------------
        
        JLabel existingaccount = new JLabel("Existing Account: ");
        existingaccount.setFont(new Font("raleway",Font.BOLD,20));
        existingaccount.setBounds(100,560,250,30);
        add(existingaccount);
        
        Edyes = new JRadioButton("Yes");
        Edyes.setFont(new Font("raleway",Font.BOLD,16));
        Edyes.setBounds(300,560,100,30);
        Edyes.setBackground(Color.white);
        add(Edyes);
        
        Edno = new JRadioButton("No");
        Edno.setFont(new Font("raleway",Font.BOLD,16 ));
        Edno.setBounds(450,560,100,30);
        Edno.setBackground(Color.white);
        add(Edno);
        
        ButtonGroup existingaccountGroup = new ButtonGroup();
        existingaccountGroup.add(Edno);
        existingaccountGroup.add(Edno);
        
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
        new SignUpTwo("");
                
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String strReligion = (String)religionComboBox.getSelectedItem();
        String strCategory = (String)categoryComboBox.getSelectedItem();
        String strIncome = (String)incomeComboBox.getSelectedItem();
        String strQualification = (String)qualificationComboBox.getSelectedItem();
        String strOccupation = (String)occupationComboBox.getSelectedItem();
        String strPan = panTextField.getText();
        String strAadhar = aadharTextField.getText();
        String strCitizen = null;
        if(Syes.isSelected())
        {
            strCitizen = "Yes";
        }
        else if(Sno.isSelected())
        {
            strCitizen = "No";
        }
        
        String strExistingAc = null;
        if(Edyes.isSelected())
        {
            strExistingAc = "Yes";
        }
        else if(Edno.isSelected())
        {
            strExistingAc = "No";
        }

              
        try{
             if(strPan.equals(""))
                {
                    count++;
                    JOptionPane.showMessageDialog(null, "PAN Number is Required..");
                }
                else if(strAadhar.equals(""))
                {
                    count++;
                    JOptionPane.showMessageDialog(null, "Aadhar Number is Required..");
                }
                else if(strExistingAc.equals(""))
                {
                    count++;
                    JOptionPane.showMessageDialog(null, "Existing Account is Required..");
                }
            
            if(ae.getSource() == next)
                {
                    if(count == 0)
                    {
                        Conn c = new Conn();
                        String query = "insert into signupTwo values('"+formno+"', '"+strReligion+"', '"+strCategory+"', '"+strIncome+"', '"+strQualification+"', '"+strOccupation+"', '"+strPan+"', '"+strAadhar+"', '"+strCitizen+"', '"+strExistingAc+"')";        
                        c.s.execute(query);
                        
                        setVisible(false);
                        new SignUpThree(formno).setVisible(true); 
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

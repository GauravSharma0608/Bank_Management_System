
package bank.management.system;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {
    
    long random;
    JTextField nameTextField,fnameTextField,addressTextField,emailTextField,dobTextField,cityTextField,stateTextField,pincodeTextField;
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser dateChooser;
    SignupOne(){
        setLayout(null);
        
        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 900L) + 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO. " +random );
        formno.setFont(new Font("RALEWAY",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page  1: Personal Details");
        personalDetails.setFont(new Font("RALEWAY",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
         
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("RALEWAY",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
          nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fname= new JLabel("Father's Name:");
        fname.setFont(new Font("RALEWAY",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
          fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        
         next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.addActionListener(this);
        next.setBounds(620,660,80,30);
        add(next);
        
         JLabel dob= new JLabel("Date of Birth: ");
        dob.setFont(new Font("RALEWAY",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        
         dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
//         JTextField dobTextField = new JTextField();
//        dobTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        dobTextField.setBounds(300,240,400,30);
//        add(dobTextField);
        
         JLabel gender= new JLabel(" Gender:");
        gender.setFont(new Font("RALEWAY",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
         male = new JRadioButton("Male");
        male.setBackground(Color.WHITE);
        male.setBounds(300,290,60,30);
        add(male);
        
          female = new JRadioButton("Female");
         female.setBackground(Color.WHITE);
        female.setBounds(450,290,120,30);
        add(female);
        
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        
//         JTextField genderTextField = new JTextField();
//        genderTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        genderTextField.setBounds(300,290,400,30);
//        add(genderTextField);
        
         JLabel email= new JLabel("Email Address:");
        email.setFont(new Font("RALEWAY",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
           emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
         JLabel martial= new JLabel("Martial Staus:");
        martial.setFont(new Font("RALEWAY",Font.BOLD,20));
        martial.setBounds(100,390,200,30);
        add(martial);
        
         married = new JRadioButton("Married");
        married.setBackground(Color.WHITE);
        married.setBounds(300,390,100,30);
        add(married);
        
          unmarried = new JRadioButton("UnMarried");
         unmarried.setBackground(Color.WHITE);
        unmarried.setBounds(450,390,100,30);
        add(unmarried);
        
         other = new JRadioButton("Other");
         other.setBackground(Color.WHITE);
        other.setBounds(650,390,100,30);
        add(other);
        
        
        ButtonGroup martialgroup = new ButtonGroup();
        martialgroup.add(married);
        martialgroup.add(unmarried);
        martialgroup.add(other);
        
//         JTextField martialTextField = new JTextField();
//        martialTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        martialTextField.setBounds(300,390,400,30);
//        add(martialTextField);
        
         JLabel address= new JLabel("Address:");
        address.setFont(new Font("RALEWAY",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
          addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
         JLabel city= new JLabel("City:");
        city.setFont(new Font("RALEWAY",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
          cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
         JLabel state= new JLabel("State:");
        state.setFont(new Font("RALEWAY",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
          stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
         JLabel pincode= new JLabel("Pin Code:");
        pincode.setFont(new Font("RALEWAY",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
         pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameTextField.getText();
        String fnmae  = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()){
            gender = "Male";
        }else if (female.isSelected()) {
            gender = "Female";
        }
        String email = emailTextField.getText();
        String martial = null;
        if(married.isSelected()){
            martial ="Married";
        }else if(unmarried.isSelected()){
            martial = "Unmarried";
        }else if(other.isSelected()){
            martial = "Other";
        }
            String address = addressTextField.getText();
            String city = cityTextField.getText();
            String state = stateTextField.getText();
            String pincode = pincodeTextField.getText();    
            String fname = fnameTextField.getText();
    try{
    if (name.equals("")){
        JOptionPane.showMessageDialog(null,"Name is Required");
    }else{
        conn c = new conn();
        String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
        c.s.executeUpdate(query);
        
        setVisible(false);
        new SignupTwo(formno).setVisible(true);
    }
}catch(Exception e){
    System.out.println(e);
}

    }
//    "String'"+variable+"'String"
    
    public static void main(String args[]){
        new SignupOne();
    }
    
   
}

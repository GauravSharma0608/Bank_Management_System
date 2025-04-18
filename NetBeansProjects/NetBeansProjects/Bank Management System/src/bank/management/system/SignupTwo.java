
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,education,income;
    String formno;
    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM -PAGE 2");
        
        
        
        JLabel additionalDetails = new JLabel("Page  2: Additional Details");
        additionalDetails.setFont(new Font("RALEWAY",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
         
        JLabel name = new JLabel("Religion");
        name.setFont(new Font("RALEWAY",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[] = {"Hindu","Muslim","Christian","others"};   
         religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.white);
        add(religion);
        
 
       
        JLabel fname= new JLabel(" Cateogry:");
        fname.setFont(new Font("RALEWAY",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valcategory[] = {"General","OBC","SC","ST","Other"};
         category = new JComboBox(valcategory);
         category.setBackground(Color.white);
        category.setBounds(300,190,400,30);
        add(category);
        
        
//         next = new JButton("Next");
//        next.setBackground(Color.BLACK);
//        next.setForeground(Color.WHITE);
//        next.setFont(new Font("Raleway",Font.BOLD,14));
//        next.addActionListener(this);
//        next.setBounds(620,660,80,30);
//        add(next);
        
         JLabel dob= new JLabel(" Income: ");
        dob.setFont(new Font("RALEWAY",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String incomecateogry[] = {"null","<1,50,000","<2,50,0000","<5,00,0000","upto 10,00,0000"};
         income = new JComboBox(incomecateogry);
         income.setBackground(Color.white);
        income.setBounds(300,240,400,30);
        add(income);
       
        
         JLabel gender= new JLabel(" Educational");
        gender.setFont(new Font("RALEWAY",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        
        
         JLabel email= new JLabel("Qualification:");
        email.setFont(new Font("RALEWAY",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        String educationalvalues[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
         education = new JComboBox(educationalvalues);
         education.setBackground(Color.white);
        education.setBounds(300,315,400,30);
        add(education);
        
        
        
         JLabel marital= new JLabel("Occupation:");
        marital.setFont(new Font("RALEWAY",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
         String occupationvalues[] = {"Salaried","Self-Employed","Bussiness","Student","Retired","others"};
         occupation = new JComboBox(occupationvalues);
         occupation.setBackground(Color.white);
        occupation.setBounds(300,390,400,30);
        add(occupation);
        
       
        
         JLabel address= new JLabel("Pan Number:");
        address.setFont(new Font("RALEWAY",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
          pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
         JLabel city= new JLabel("Aadhar Number:");
        city.setFont(new Font("RALEWAY",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
          aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
         JLabel state= new JLabel("Senoir Citizen:");
        state.setFont(new Font("RALEWAY",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
       syes = new JRadioButton("Yes");
        syes.setBackground(Color.WHITE);
        syes.setBounds(300,540,100,30);
        add(syes);
        
          sno = new JRadioButton("No");
         sno.setBackground(Color.WHITE);
        sno.setBounds(450,540,100,30);
        add(sno);
        
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
        
         JLabel pincode= new JLabel("Existing Account :");
        pincode.setFont(new Font("RALEWAY",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
          
       eyes = new JRadioButton("Yes");
        eyes.setBackground(Color.WHITE);
        eyes.setBounds(300,590,100,30);
        add(eyes);
        
          eno = new JRadioButton("No");
         eno.setBackground(Color.WHITE);
        eno.setBounds(450,590,100,30);
        add(eno);
        
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
       
        String sreligion = (String) religion.getSelectedItem();
       String scategory = (String) category.getSelectedItem();
       String sincome = (String) income.getSelectedItem();
       String seducation = (String) education.getSelectedItem();
       String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if (syes.isSelected()){
            seniorcitizen = "Yes";
        }else if (sno.isSelected()) {
            seniorcitizen = "No";
        }
        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount ="Yes";
        }else if(eno.isSelected()){
            existingaccount = "No";
        }
            String span = pan.getText();
            String saadhar = aadhar.getText();
            
        try{   
         conn c = new conn();
        String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
        c.s.executeUpdate(query);   
    }
catch(Exception e){
    System.out.println(e);
}
         if(ae.getSource() == next){
            setVisible(false);
            new SignupThree("").setVisible(true);
        }

    }
//    "String'"+variable+"'String"
    
    public static void main(String args[]){
        new SignupTwo("");
    }
    
   
}

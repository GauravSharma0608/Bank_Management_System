package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transactions extends JFrame implements ActionListener {
    
    JButton deposit,withdrawal,ministatement,pinchange,fastcash,balanceenquiry,exit;
    String pinnumber;
    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,700);
        add(image);
        
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(210,180,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
         deposit = new JButton("Deposit");
        deposit.setBounds(170,230,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
           withdrawal = new JButton(" cash Withdrawal");
        withdrawal.setBounds(355,230,150,30);
        withdrawal.addActionListener(this);
        image.add(withdrawal);
        
           fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170,275,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
         ministatement = new JButton(" Mini Statement");
        ministatement.setBounds(355,275,150,30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
          pinchange = new JButton(" Pin Change");
        pinchange.setBounds(170,320,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
         balanceenquiry = new JButton(" Balance Enqiury ");
        balanceenquiry.setBounds(355,320,150,30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
         exit = new JButton(" Exit ");
        exit.setBounds(355,365,150,30);
        exit.addActionListener(this);
        image.add(exit);
       
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
         setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit){
            System.exit(0);
        }else if(ae.getSource() == deposit) {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource() == withdrawal){
            setVisible(false);
            new Withdrawal(pinnumber).setVisible(true);
        }
    }
    public static void main(String args[]){
        new Transactions("");
    }
}


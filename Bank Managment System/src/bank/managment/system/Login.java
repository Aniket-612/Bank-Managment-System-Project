package bank.managment.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{//actionlistner is used for buttons to perform some certain actions
    JLabel label1,label2,label3;

    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;
    Login(){
        super("Bank Managment System");//name of our frame(THIS SHOULD BE WRITTEN ALWAYS ON TOP OTHERWISE IT WILL GIVE AN ERROR)

        ImageIcon bankimage = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));//creates an imageicon object
        Image I2 = bankimage.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);//creates a new image from imageicon object
        ImageIcon I3 = new ImageIcon(I2);//takes image on the frame
        JLabel image = new JLabel(I3);//helps image get visible on the frame
        image.setBounds(350,10,100,100);//sets boundry and location of image
        add(image);//adds image to the screen

        ImageIcon cardimage = new ImageIcon(ClassLoader.getSystemResource("Icon/card.png"));
        Image Ii2 = cardimage.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon Ii3 = new ImageIcon(Ii2);//takes image on the frame
        JLabel iimage = new JLabel(Ii3);//helps image get visible on the frame
        iimage.setBounds(630,350,100,100);//sets boundry and location of image
        add(iimage);


        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);//font color
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(230, 125, 450, 40);
        add(label1);

        label2=new JLabel("Card No.");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setBounds(150, 190, 375, 30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        textField2.setBounds(325,190,230,30);
        add(textField2);

        label3=new JLabel("PIN");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setBounds(150, 250, 375, 30);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        button1=new JButton("Sign In");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);  

        button2 = new JButton("Clear");
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);//this is used , as if a button is clicked that click is stored in actionEvent
        add(button2);

        button3 = new JButton("Sign Up");
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setBounds(300, 350, 230, 30);
        button3.addActionListener(this);
        add(button3);


        ImageIcon bground = new ImageIcon(ClassLoader.getSystemResource("Icon/backbg.png"));
        Image Iii2 = bground.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon Iii3 = new ImageIcon(Iii2);//takes image on the frame
        JLabel Iiimage = new JLabel(Iii3);//helps image get visible on the frame
        Iiimage.setBounds(0,0,850,480);//sets boundry and location of image
        add(Iiimage);

        setLayout(null);//does not arrange the components in a particular way . user can control the components
        setSize(850, 480);//sets the size of the frame which will appear
        setLocation(450, 200);//location of frame on the scren
        setUndecorated(true);//takes the full screen and minimize buttons away
        setVisible(true);//initially the frame is invisible(by default).setting it as true makes it visible(ALWAYS AT THE BOTTOM)

    }

    //this function is written because actionlister throwas an error if used normally
    @Override
    public void actionPerformed(ActionEvent E){
        try{
            if (E.getSource()==button1){
                Connn c = new Connn();
                String cardno = textField2.getText();
                String pin = passwordField3.getText();
                String q = "select * from login where card_number = '"+cardno+"' and  pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);

                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }


            }else if (E.getSource() == button2){
                textField2.setText("");
                passwordField3.setText("");
            }else if (E.getSource() == button3){
                new Signup();
                setVisible(false);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Login();

    }
}
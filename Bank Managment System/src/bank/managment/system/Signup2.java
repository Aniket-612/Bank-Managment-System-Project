package bank.managment.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Signup2 extends JFrame implements ActionListener{
    String formno;

    JComboBox jComboBox1,jComboBox2,jComboBox3,jComboBox4,jComboBox5;//dropdown for religion ,category andd income 

    JTextField aadharno,panno,age;

    JRadioButton e1,e2;

    JButton jButton;


    Signup2(String formno){//we catched the string thrown in the signup class
        setTitle("Application Form");

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image ImageIcon2 = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ImageIcon3 = new ImageIcon(ImageIcon2);
        JLabel image = new JLabel(ImageIcon3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno=formno;//formno came to class 2 after getting passed in signup

        JLabel l1 = new JLabel("Page 2 :");
        l1.setFont(new Font("Raleway", Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300, 60, 600,40);
        add(l2);

        JLabel reliJLabel = new JLabel("Religion");
        reliJLabel.setFont(new Font("Raleway",Font.BOLD,22));
        reliJLabel.setBounds(100,120,100,30);
        add(reliJLabel);

        String[] religion = {"Hindu","Muslim","Sikh","Christian","Hell Members"};
        jComboBox1 = new JComboBox(religion);
        jComboBox1.setBackground(new Color(252,208,76));
        jComboBox1.setFont(new Font("Raleway",Font.BOLD,14));
        jComboBox1.setBounds(350,120,350,30);
        add(jComboBox1);



        JLabel catjLabel = new JLabel("Category");
        catjLabel.setFont(new Font("Raleway",Font.BOLD,22));
        catjLabel.setBounds(100, 170, 100,30);
        add(catjLabel);

        String[] Category = {"General","OBC","SC","SC","Others"};
        jComboBox2=new JComboBox<>(Category);
        jComboBox2.setBackground(new Color(252,208,76));
        jComboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        jComboBox2.setBounds(350,170,320,30);
        add(jComboBox2);

       
        JLabel incomLabel = new JLabel("Income");
        incomLabel.setFont(new Font("Raleway",Font.BOLD,22));
        incomLabel.setBounds(100,220,100,30);
        add(incomLabel);


        String[] income = {"Below 55000","Between 55000 and 100000","Between 100000 and 250000","More than 250000"};

        jComboBox3 = new JComboBox(income);
        jComboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        jComboBox3.setBackground(new Color(252,208,76));
        jComboBox3.setBounds(350,220,320,30);
        add(jComboBox3);

        
        JLabel eduJLabel = new JLabel("Educational Details:");
        eduJLabel.setFont(new Font("Raleway",Font.BOLD,22));
        eduJLabel.setBounds(100,270,150,30);
        add(eduJLabel);

        String[] education = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        
        jComboBox4=new JComboBox(education);
        jComboBox4.setBackground(new Color(252,208,76));
        jComboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        jComboBox4.setBounds(350,270,320,30);
        add(jComboBox4);


        JLabel occuJLabel = new JLabel("Occupation");
        occuJLabel.setFont(new Font("Raleway", Font.BOLD,22));
        occuJLabel.setBounds(100,320,150,30);
        add(occuJLabel);

        String [] Occupation = {"Agriculture","Employed","Business","Retired","No occupation"};

        jComboBox5 = new JComboBox(Occupation);
        jComboBox5.setBackground(new Color(252,208,76));
        jComboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        jComboBox5.setBounds(350,320,320,30);
        add(jComboBox5);

        JLabel aadharnolbl = new JLabel("Aadhar Number.");
        aadharnolbl.setFont(new Font("Raleway",Font.BOLD,22));
        aadharnolbl.setBounds(100,370,180,30);
        add(aadharnolbl);

        aadharno = new JTextField();
        aadharno.setBounds(350,370,350,30);
        add(aadharno);

        JLabel pannoJLabel = new JLabel("Pan Number.");
        pannoJLabel.setFont(new Font("Raleway",Font.BOLD,22));
        pannoJLabel.setBounds(100,420,180,30);
        add(pannoJLabel);

        panno = new JTextField();
        panno.setBounds(350,420,350,30);
        add(panno);


        JLabel Age = new JLabel("Age.");
        Age.setFont(new Font("Raleway",Font.BOLD,22));
        Age.setBounds(100,470,100,30);
        add(Age);

        age = new JTextField();
        age.setBounds(350,470,350,30);
        add(age);


        JLabel exJLabel = new JLabel("Is Existing account?");
        exJLabel.setFont(new Font("Raleway",Font.BOLD,20));
        exJLabel.setBounds(100,520,200,30);
        add(exJLabel);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Arial",Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350, 520, 80, 30);
        add(e1);


        e2 = new JRadioButton("No");
        e2.setFont(new Font("Arial",Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(450, 520, 50, 30);
        add(e2);



        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(e1);
        buttonGroup.add(e2);

        JLabel ll1 = new JLabel("Form No.");
        ll1.setFont(new Font("Raleway", Font.BOLD,22));
        ll1.setBounds(600,10,100,40);
        add(ll1);


        JLabel ll2 = new JLabel(formno);
        ll2.setFont(new Font("Raleway", Font.BOLD,20));
        ll2.setBounds(700,10,100,40);
        add(ll2);

        jButton = new JButton("Next");
        jButton.setForeground(Color.WHITE);
        jButton.setBackground(Color.BLACK);
        jButton.setFont(new Font("Arial",Font.BOLD,14));
        jButton.setBounds(600,600,100,30);
        jButton.addActionListener(this);
        add(jButton);


        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(252, 208, 76));
        setUndecorated(true);
        setVisible(true);
    }

 
    @Override
    public void actionPerformed(ActionEvent e){
        String rel = (String)jComboBox1.getSelectedItem();
        String cate = (String)jComboBox2.getSelectedItem();
        String inc = (String)jComboBox3.getSelectedItem();
        String edu = (String)jComboBox4.getSelectedItem();
        String occ = (String)jComboBox5.getSelectedItem();
        String aadhaString = aadharno.getText();
        String pan = panno.getText();
        String ageString = age.getText();

        String exAccount ="";
        if(e1.isSelected()){
            exAccount = "Yes";
        }else{
            exAccount="No";
        }

        try{
            if(panno.getText().equals("") || aadharno.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill the necessary fields");
            }else{
                Connn c = new Connn();
                String q = "insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhaString+"','"+ageString+"',' "+exAccount+"')";
                c.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);


            }
        }catch (Exception E) {
            // TODO: handle exception
            E.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        new Signup2("");
    }
}

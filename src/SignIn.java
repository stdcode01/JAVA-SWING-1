import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SignIn extends JFrame {
    JTextField userName, email, password;
    JLabel lbUser ,lbEmail,lbPass;
    JButton click ;

    public SignIn()  {
        setTitle("Application");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);


        userName =new JTextField() ;
        email =new JTextField() ;
        password =new JPasswordField() ;
        click =new JButton("Sign in");
        lbUser=new JLabel("Username");
        lbEmail=new JLabel("Email");
        lbPass=new JLabel("Password");

    userName.setBounds(100,10,100,20);
    lbUser.setBounds(10,10,100,20);
    email.setBounds(100,30,100,20);
    lbEmail.setBounds(10,30,100,20);
    password.setBounds(100,50,100,20);
    lbPass.setBounds(10,50,100,20);


        click.setBounds(10,100,260,20);
        click.setBackground(Color.CYAN);
        //email.setMargin(new Insets(10,10,10,2));

        add(lbUser);
        add(lbPass);
        add(lbEmail);

        add(userName);
        add(email);
        add(password);
        add(click);


        //last line
        setVisible(true);

        click.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(userName.getText().isEmpty()||email.getText().isEmpty()||password.getText().isEmpty()){
                    JOptionPane.showMessageDialog(SignIn.this,
                              "Error","Application",JOptionPane.ERROR_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(SignIn.this,"Sign in Successful",
                            "Application",JOptionPane.INFORMATION_MESSAGE);
                }

                System.out.println("UserName :"+userName.getText());
                System.out.println("Email :"+email.getText());
                System.out.println("Password :"+password.getText());
            }
        });
    }



}

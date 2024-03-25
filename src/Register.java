import javax.swing.*;
import java.awt.*;

public class Register {
    JTextField userName, email, password;
    JLabel lbUser, lbEmail, lbPass, lbSexe, lbSave;
    JRadioButton rbMal, rbfemal;
    JCheckBox checkBox;
    JButton click;

    public Register() {
        initialFrame();
    }

    void initialFrame() {
        JFrame frame = new JFrame();
        frame.setTitle("Register");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.LIGHT_GRAY);

        JPanel panUserName = new JPanel();
        panUserName.setLayout(null);
        JPanel panEmail = new JPanel();
        panEmail.setLayout(null);
        JPanel panPwd = new JPanel();
        panPwd.setLayout(null);
        JPanel panBtn = new JPanel();
        panBtn.setLayout(null);
        JPanel panCheckbox=new JPanel() ;panCheckbox.setLayout(null);
        JPanel panS = new JPanel();
        panS.setLayout(null);

        frame.add(panUserName);
        frame.add(panEmail);
        frame.add(panPwd);
        frame.add(panBtn);
        frame.add(panCheckbox) ;
        frame.add(panS);


        lbUser = new JLabel("UserName ");
        lbEmail = new JLabel("Email ");
        lbPass = new JLabel("Password ");
        lbSexe = new JLabel("Sexe :");
        rbMal = new JRadioButton("Mal");
        rbfemal = new JRadioButton("Femal");
        checkBox = new JCheckBox("save information", true);

        userName = new JTextField();
        email = new JTextField();
        password = new JPasswordField();
        click = new JButton("Sign in");

        userName.setBounds(100, 5, 150, 20);
        lbUser.setBounds(10, 5, 100, 20);

        email.setBounds(100, 5, 150, 20);
        lbEmail.setBounds(10, 5, 100, 20);

        password.setBounds(100, 5, 150, 20);
        lbPass.setBounds(10, 5, 100, 20);

        lbSexe.setBounds(10, 5, 100, 20);
        rbMal.setBounds(100, 5, 50, 20);
        rbfemal.setBounds(150, 5, 100, 20);

        // Set preferred size for the checkbox
        checkBox.setPreferredSize(new Dimension(150, 20));
        checkBox.setBounds(10, 5, 150, 20);

        click.setBounds(10, 5, 200, 20);
        click.setBackground(Color.CYAN);

        panUserName.setBounds(0, 0, 300, 30);
        panEmail.setBounds(0, 30, 300, 30);
        panPwd.setBounds(0, 60, 300, 30);
        panS.setBounds(0, 90, 300, 30);
        panCheckbox.setBounds(0,120,300,30);

        panBtn.setBounds(0, 150, 300, 30);

        panUserName.add(lbUser);
        panUserName.add(userName);
        panEmail.add(lbEmail);
        panEmail.add(email);
        panPwd.add(lbPass);
        panPwd.add(password);
        panS.add(lbSexe);
        panS.add(rbMal);
        panS.add(rbfemal);
        panCheckbox.add(checkBox) ;
        panBtn.add(click);

        frame.setVisible(true);
    }
}

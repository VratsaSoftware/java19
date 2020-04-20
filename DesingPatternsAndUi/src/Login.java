import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {

    private static final String USER = "admin";
    private static final String PASSWORD = "1234";

    private JFrame frame;
    private JPanel panel;
    private JLabel labelName;
    private JLabel labelPassword;
    private JTextField txtName;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JLabel labelLoginStatus;

    public static void main(String[] args) {
        Login loginWindow = new Login();
        loginWindow.createLoginFormWindow();
    }

    private void createLoginFormWindow() {
        frame = new JFrame("Login");
        frame.pack();
        frame.setVisible(true);

        createPanelComponents();

        panel = new JPanel();
        panel.add(labelName);
        panel.add(txtName);
        panel.add(labelPassword);
        panel.add(txtPassword);
        panel.add(btnLogin);
        panel.add(labelLoginStatus);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void createPanelComponents() {
        labelName = new JLabel("Username:");
        labelPassword = new JLabel("Password:");
        labelLoginStatus = new JLabel();
        labelLoginStatus.setVisible(false);

        txtName = new JTextField(20);
        txtPassword = new JPasswordField(20);

        btnLogin = new JButton("Login");
        btnLogin.setBackground(Color.GRAY);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkLoginData();
            }
        });
    }

    private void checkLoginData() {
        String enteredName = txtName.getText();
        String enteredPassword = txtPassword.getText();

        if (enteredName.equals(USER) && enteredPassword.equals(PASSWORD)) {
            labelLoginStatus.setText("Login successful");
        } else {
            labelLoginStatus.setText("Login failed");
        }
        labelLoginStatus.setVisible(true);
    }
}

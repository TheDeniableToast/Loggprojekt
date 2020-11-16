import javax.swing.*;
import java.awt.event.ActionListener;

public class MVCViewForm {
    private JPanel MVCPanel;
    private JButton EnterButton = new JButton("Enter");
    private JTextArea Text = new JTextArea(10, 5);
    private JTextPane User = new JTextPane();
    private JTextArea Console = new JTextArea(20, 5);
    private JLabel LoggTitle = new JLabel("Loggbok");

    public static void main(String[] args) {
        JFrame frame = new JFrame("MVCViewForm");
        frame.setContentPane(new MVCViewForm().MVCPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public String getLogEntry() {
        return Text.getText();
    }
    public String getUser() { return User.getText(); }

    void addEnterListener(ActionListener listenForEnterButton) {
        EnterButton.addActionListener(listenForEnterButton);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

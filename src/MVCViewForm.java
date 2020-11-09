import javax.swing.*;

public class MVCViewForm {
    private JPanel MVCPanel;
    private JTextArea textArea1;
    private JButton button1;
    private JTextPane textPane1;
    private JTextArea textArea2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MVCViewForm");
        frame.setContentPane(new MVCViewForm().MVCPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

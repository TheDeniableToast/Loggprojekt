import javax.swing.*;

public class Logg {

    public static void main(String[] args) {
        MVCViewForm theView = new MVCViewForm();
        LoggModel theModel = new LoggModel();
        LoggController theController = new LoggController(theModel, theView);

        JFrame frame = new JFrame("MVCViewForm");
        frame.setContentPane(theView.getMVCPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

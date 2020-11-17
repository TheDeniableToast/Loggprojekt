import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoggController {

    private MVCViewForm theView;
    private LoggModel theModel;

    public LoggController(LoggModel theModel, MVCViewForm theView) {
        this.theModel = theModel;
        this.theView = theView;
        this.theView.addEnterListener(new EnterListener());
    }

    private class EnterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
            // Surround interactions with the view with
            // a try block in case numbers weren't
            // properly entered
            try{
                LoggEntry = theView.getLogEntry();
                User = theView.getUser();
                theModel.return(LoggEntry, User);
            }
            catch(NumberFormatException ex) {
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 Integers");
            }
        }
    }
}

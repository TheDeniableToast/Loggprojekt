import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoggController {

    private MVCViewForm theView;
    private LoggModel theModel;

    public LoggController(LoggModel theModel, MVCViewForm theView) {
        this.theModel = theModel;
        this.theView = theView;
        this.theView.addEnterListener(new EnterListener())
    }

    private class EnterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}

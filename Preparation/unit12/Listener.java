import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
/**
 *
 * @author Admin
 */
public class Listener implements ActionListener{
    private Test v;
 
    public Listener(Test v) {
        this.v = v;
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        String tmp = e.getActionCommand();
        if(tmp == "Update time"){
            this.v.setText();
        }
    }
 
}
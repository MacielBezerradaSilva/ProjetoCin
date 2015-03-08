/**
 * 
 */
package Thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;

/**
 * @author Maciel B
 *
 */
public class DateThread extends Thread{
	
	private JLabel hour;

    public DateThread(JLabel hour) {
        this.hour = hour;
    }
    
    @Override
    public void run() {
        cycle();
    }

    public void cycle() {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(DateThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            //objeto do tipo data
            Date date = new Date();
            //definindo o tipo do label da data
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss a  (EEEE, dd/MM/yy)");
            this.hour.setText(dateFormat.format(date));
        }

    }
}

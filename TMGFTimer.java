package themadgabfly;
// @author username
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static themadgabfly.Game.*;
import javax.swing.Timer;

public class TMGFTimer {
    
private static final int N = 60;
    
    private final ClockListener cl = new ClockListener();
    private final Timer t = new Timer(1000, cl);
    private final JTextField tf = new JTextField(3);

    public TMGFTimer() {
        t.setInitialDelay(1000);

    }

    public void start() {
        t.start();
    }
    public void stop(){
        t.stop();
    }
    public void reset(){
        cl.setSeconds(0);
        cl.setMinutes(0);
    }
    
    
    private class ClockListener implements ActionListener {

        private int count;
        private int seconds;
        private int minutes;
        public String minute;
        public String second;
        
        public void setSeconds(int n){
            seconds = n;
        }
        public void setMinutes(int m){
            minutes = m;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            NumberFormat formatter = new DecimalFormat("00");
        if (seconds == N) {
            seconds = 00;
            minutes++;
        }

        minute = formatter.format(minutes);
        second = formatter.format(seconds);
        
        timer.setText(String.valueOf("["+minute + ":" + second+"]"));
        seconds++;
        }
    }
}

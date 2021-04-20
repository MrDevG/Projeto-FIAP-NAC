import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args){
        JTabbedPane aba = new JTabbedPane();
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Home frame = new Home();
                    frame.setUndecorated(true);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

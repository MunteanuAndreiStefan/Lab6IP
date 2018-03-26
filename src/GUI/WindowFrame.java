package GUI;

import javax.swing.*;
import java.awt.*;

public class WindowFrame extends JFrame {
    private ControlPanel control;
    private LogZone log;
    public WindowFrame(){
        super("GUI");
        init();
    }

    private void init(){
        this.getContentPane().setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        control = new ControlPanel(this);
        this.getContentPane().add(control, BorderLayout.SOUTH);

        log = new LogZone();
        this.getContentPane().add(log, BorderLayout.CENTER);

        this.setSize(800, 400);
    }

    public void start(){
        this.setVisible(true);
    }


    public ControlPanel getControl() {
        return control;
    }

    public LogZone getLogZone() {
        return this.log;
    }

}

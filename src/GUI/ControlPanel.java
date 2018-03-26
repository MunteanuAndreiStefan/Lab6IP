package GUI;

import javax.swing.*;

public class ControlPanel extends JPanel {
    private final WindowFrame frame;
    private JButton loadBtn, saveBtn, uploadBtn;

    ControlPanel(WindowFrame frame) {
        this.frame = frame;
        loadBtn = new JButton("Upload");
        //saveBtn = new JButton("Save");
        uploadBtn = new JButton("View");
        init();
    }
    private void init() {
        add(loadBtn);
        //add(saveBtn);
        add(uploadBtn);
        loadBtn.addActionListener(new UploadCommand(this));
        uploadBtn.addActionListener(new OpenCommand(this));
        //saveBtn.addActionListener(new SaveCommand(this));
    }

    public WindowFrame getFrame() {
        return frame;
    }

}

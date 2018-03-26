package GUI;

import javax.swing.*;
import java.io.Serializable;

public class LogZone extends JList implements Serializable {
    private DefaultListModel<String> model = new DefaultListModel<>();
    private JList<String> list = new JList<>(model);
    public LogZone() {
        String title = "<html><i><font color='blue'>" +
                "Logs" + "</font></i></html>";
        this.setBorder(BorderFactory.createTitledBorder(title));
        this.setModel(model);
    }

    public void addDocument(String status) {
        model.addElement(status);
    }

    @Override
    public DefaultListModel getModel() {
        return model;
    }
}

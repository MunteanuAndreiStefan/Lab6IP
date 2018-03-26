package GUI;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UploadCommand implements ActionListener {
    private WindowFrame frame;
    private JFileChooser fileChooser;
    private LogZone logs;
    public UploadCommand(ControlPanel panel) {
        this.frame = panel.getFrame();
        logs = frame.getLogZone();
        fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    }

    public void actionPerformed(ActionEvent e) {
        int rVal = fileChooser.showOpenDialog(frame.getControl());
        if (rVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("Loading " + fileChooser.getSelectedFile().getAbsolutePath() + "...");
            System.out.println("new instance was created");
            //logs.getModel().addElement("Something");
            //loadCatalog(fileChooser.getSelectedFile().getAbsolutePath());
        }
        if (rVal == JFileChooser.CANCEL_OPTION) {
            System.out.println("Loading canceled");
        }
    }
    /*
    private void loadCatalog(String path) {
        CatalogList rez = new CatalogList();
        CatalogTable rezTable = new CatalogTable();
        Vector toAdd;
        try {
            FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            rez = (CatalogList) in.readObject();
            rezTable = (CatalogTable) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            //i.printStackTrace();
            System.out.println("You may only select a CatalogList!");
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
        }
        frame.getList().getModel().removeAllElements();
        frame.getCatalogTable().removeData();

        for (int i = 0; i < rez.getModel().getSize(); ++i)
            frame.getList().addDocument(rez.getModel().get(i).toString());

        for (int i = 0; i < rezTable.getTable().getRowCount(); ++i) {
            toAdd = new Vector<>();
            for (int j = 0; j < rezTable.getTable().getColumnCount(); ++j) {
                toAdd.add(rezTable.getTable().getModel().getValueAt(i, j).toString());
            }
            frame.getCatalogTable().addDocument(toAdd);
        }
    }
    */
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;

/**
 *
 * @author andrew
 */
public class Logger {
    String text;
    public Logger(String text){
        this.text=text;
    }
    @Override
    public String toString(){
        return text;
    }
    public void writeInto(String path){
        try (PrintWriter out = new PrintWriter(path)) {
        out.println(text);
}       catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Logger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

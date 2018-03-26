package Model;

import java.io.FileNotFoundException;

public class Audio implements File {
    String path;

    Audio(String path){
        this.path = path;
    }

    public Audio() {

    }

    public String getPath() {
        return path;
    }

    public boolean load(String audio) throws FileNotFoundException {
        this.path = audio;
        return(true);
    }

    public String getType() {
        return "Auditiv";
    }
}

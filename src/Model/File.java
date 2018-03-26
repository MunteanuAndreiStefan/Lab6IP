package Model;

import java.io.FileNotFoundException;

public interface File {
    String getPath();
    boolean load(String file) throws FileNotFoundException;
    String getType();
}

package Utils;

import java.io.File;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoggerTest {

    Logger logger= new Logger("Text");


    @Test
    public void writeInto() {
        String path="test.log";
        logger.writeInto(path);
        File f= new File(path);
        assertTrue(f.exists());
    }
}

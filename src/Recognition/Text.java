package Recognition;

import Utils.File;
import Utils.Logger;

public class Text implements Recognition {

    @Override
    public Logger analyzeInput(File file) {
        String randomValue = String.valueOf(Math.random()+100);
        Logger logger = new Logger(randomValue);
        logger.writeInto("TextLogger");
        return logger;
    }
}

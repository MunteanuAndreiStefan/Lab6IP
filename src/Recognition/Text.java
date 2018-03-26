package Recognition;

import Model.File;
import Utils.Logger;

public class Text implements Recognition {

    @Override
    public Logger analyzeInput(File file) {
        String randomValue = String.valueOf(200);
        Logger logger = new Logger(randomValue);
        logger.writeInto("TextLogger");
        return logger;
    }
}

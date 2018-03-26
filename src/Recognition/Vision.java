package Recognition;

import Utils.File;
import Utils.Logger;

public class Vision implements Recognition {
    @Override
    public Logger analyzeInput(File file) {
        String randomValue = String.valueOf(100);
        Logger logger = new Logger(randomValue);
        logger.writeInto("VisionLogger");
        return logger;
    }
}

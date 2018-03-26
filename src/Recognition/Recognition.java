package Recognition;

import Utils.File;
import Utils.Logger;
import sun.rmi.runtime.Log;

public interface Recognition {
    Logger analyzeInput(File file);

}

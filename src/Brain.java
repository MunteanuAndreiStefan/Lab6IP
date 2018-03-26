import Utils.File;
import Recognition.Recognition;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Brain {

    public Brain(){
        System.out.println("Brain was created");
    }

    public static void Analyze (File file){
        Recognition rec = null;

        Class calledClass = Class.forName("Utils."+file.getType()); //get class

        rec = (Recognition)calledClass.newInstance(); // invoke empty constructor (creates new obj)

        rec.analyzeInput(file);
    }
}

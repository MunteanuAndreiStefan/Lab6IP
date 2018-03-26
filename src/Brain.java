import Recognition.Recognition;
import Utils.File;

public class Brain {

    public Brain(){
        System.out.println("Brain was created");
    }

    public static void Analyze (File file) throws IllegalAccessException, InstantiationException
    {
        Recognition rec = null;

        Class calledClass = Class.forName("Utils."+file.getType()); //get class

        rec = (Recognition)calledClass.newInstance(); // invoke empty constructor (creates new obj)

        rec.analyzeInput(file);
    }
}

package Utils;
import Model.Audio;
import Model.File;
import Model.Image;

public class Upload {
    public Upload(){

    }
    public String getImage(){
        File image = new Image();
        return image.getPath();
    }

    public String getAudio(){
        File audio = new Audio();
        return audio.getPath();
    }
}

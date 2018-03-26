package Utils;
import Model.Audio;
import Model.File;
import Model.Image;

public class Upload {
    Upload(){

    }
    String getImage(){
        File image = new Image();
        return image.getPath();
    }

    String getAudio(){
        File audio = new Audio();
        return audio.getPath();
    }
}

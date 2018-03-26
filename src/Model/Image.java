package Model;

public class Image implements File {
    public String path;

    Image(String path){
        this.path = path;
    }

    public Image() {

    }
    public String getPath() {
        return path;
    }

    public boolean load(String image) {
        this.path = image;
        return true;
    }

    public String getType() {
        return "Vizual";
    }
}

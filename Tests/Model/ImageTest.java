package Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImageTest {

    @Test
    public void getPath() {
    Image image=new Image("C:/");
    assertEquals("C:/",image.getPath());
    }

    @Test
    public void load() {
        Image image=new Image("C:/");
        assertTrue(image.load("image"));
    }

    @Test
    public void getType() {
        Image image=new Image("C:/");
        assertEquals("Vizual",image.getType());
    }
}
package Model;

import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class AudioTest {
    Audio audio= new Audio("path");
    @Test
    public void getPath() {
    assertEquals("path", audio.getPath());
    }

    @Test
    public void load() throws FileNotFoundException {
        assertTrue(audio.load("math"));

    }

    @Test
    public void getType()  {
        assertEquals("Auditiv",audio.getType());
    }
}
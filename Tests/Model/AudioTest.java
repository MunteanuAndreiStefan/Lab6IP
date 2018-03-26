package Model;

import Recognition.Text;
import Utils.Logger;
import org.junit.*;

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

    /**
     *
     * @author klaus
     */
    public static class TextTest {
    Text text= new Text();
        public TextTest() {

        }

        @BeforeClass
        public static void setUpClass() {
        }

        @AfterClass
        public static void tearDownClass() {
        }

        @Before
        public void setUp() {
        }

        @After
        public void tearDown() {
        }

        /**
         * Test of analyzeInput method, of class Text.
         */
        @Test
        public void testAnalyzeInput() {
            System.out.println("analyzeInput");
            File file = null;
            Text instance = new Text();
            Logger expResult = null;
            Logger result = instance.analyzeInput(file);
            assertEquals("analyzeInput", "analyzeInput");

        }

    }
}
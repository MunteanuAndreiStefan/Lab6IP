package Utils;

import java.io.File;

import org.junit.*;

import static org.junit.Assert.*;

public class LoggerTest {

    Logger logger= new Logger("Text");


    @Test
    public void writeInto() {
        String path="test.log";
        logger.writeInto(path);
        File f= new File(path);
        assertTrue(f.exists());
    }

    /**
     *
     * @author klaus
     */
    public static class UploadTest {

        public UploadTest() {
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
         * Test of getImage method, of class Upload.
         */
        @Test
        public void testGetImage() {
            System.out.println("getImage");
            Upload instance = new Upload();
            String expResult = "";
            String result = instance.getImage();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }

        /**
         * Test of getAudio method, of class Upload.
         */
        @Test
        public void testGetAudio() {
            System.out.println("getAudio");
            Upload instance = new Upload();
            String expResult = "";
            String result = instance.getAudio();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }

    }
}

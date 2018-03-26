/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests.Utils;

import Utils.Upload;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author klaus
 */
public class UploadTest {
    
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

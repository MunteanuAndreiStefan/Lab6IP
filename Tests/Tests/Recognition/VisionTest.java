/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests.Recognition;

import Model.File;
import Recognition.Vision;
import Utils.Logger;
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
public class VisionTest {
    
    public VisionTest() {
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
     * Test of analyzeInput method, of class Vision.
     */
    @Test
    public void testAnalyzeInput() {
        System.out.println("analyzeInput");
        File file = null;
        Vision instance = new Vision();
        Logger expResult = null;
        Logger result = instance.analyzeInput(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

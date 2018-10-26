/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class ComteServiceTest {
    
    public ComteServiceTest() {
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
     * Test of initBD method, of class ComteService.
     */
//    @Test
//    public void testInitBD() {
//        System.out.println("initBD");
//        ComteService instance = new ComteService();
//        instance.initBD();
//      
//    }

    /**
     * Test of ouvrirCompt method, of class ComteService.
     */
//    @Test
//    public void testOuvrirCompt() {
//        System.out.println("ouvrirCompt");
//        String rib = "";
//        double soldeInitial = 0.0;
//        ComteService instance = new ComteService();
//        Compte expResult = null;
//        Compte result = instance.ouvrirCompt(rib, soldeInitial);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of debiterCompt method, of class ComteService.
//     */
    @Test
    public void testDebiterCompt() {
        System.out.println("debiterCompt");
        String rib = "EE4";
        double montant = 20.0;
        ComteService instance = new ComteService();
        int expResult = 1;
        int result = instance.debiterCompt(rib, montant);
        assertEquals(expResult, result);
    }

    /**
     * Test of transferer method, of class ComteService.
     */
    @Test
    public void testTransferer() {
        System.out.println("transferer");
        String rib1 = "EE5";
        String rib2 = "EE2";
        double montant = 30.0;
        ComteService instance = new ComteService();
        int expResult = 1;
        int result = instance.transferer(rib1, rib2, montant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}

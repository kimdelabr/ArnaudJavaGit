/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaGit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ARNAUD KIMA
 */
public class MesFonctionsTest {
    
   
    /**
     * Test of minimum method, of class MesFonctions.
     */
    @Test
    public void testMinimum() {
        System.out.println("minimum");
        int a = 15;
        int b = 52;
        MesFonctions instance = new MesFonctions();
        int expResult = 15;
        int result = instance.minimum(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maximum method, of class MesFonctions.
     */
    @Test
    public void testMaximum() {
        System.out.println("maximum");
        int a = 18;
        int b = 46;
        MesFonctions instance = new MesFonctions();
        int expResult = 46;
        int result = instance.maximum(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of factorielle method, of class MesFonctions.
     */
    @Test
    public void testFactorielle() {
        System.out.println("factorielle");
        int n = 5;
        MesFonctions instance = new MesFonctions();
        int expResult = 120;
        int result = instance.factorielle(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estPalindrome method, of class MesFonctions.
     */
    @Test
    public void testEstPalindrome() {
        System.out.println("estPalindrome");
        String ch = "gjjjukubkj";
        MesFonctions instance = new MesFonctions();
        boolean expResult = false;
        boolean result = instance.estPalindrome(ch);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

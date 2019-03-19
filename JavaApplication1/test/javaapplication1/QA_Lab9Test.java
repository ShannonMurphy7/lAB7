/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tuf65538
 */
public class QA_Lab9Test {
    
    public QA_Lab9Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of CreateBoard method, of class QA_Lab9.
     */
    @Test
    public void testCreateBoard() {
        System.out.println("CreateBoard");
        char[][] expResult = null;
        char[][] result = QA_Lab9.CreateBoard();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printBoard method, of class QA_Lab9.
     */
    @Test
    public void testPrintBoard() {
        System.out.println("printBoard");
        QA_Lab9.printBoard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CurrentPlayer method, of class QA_Lab9.
     */
    @Test
    public void testCurrentPlayer() {
        System.out.println("CurrentPlayer");
        assertEquals('X', 'X');
        assertEquals('O', 'O');
    }

    /**
     * Test of ChangePlayer method, of class QA_Lab9.
     */
    @Test
    public void testChangePlayer() {
        System.out.println("ChangePlayer");
        QA_Lab9.ChangePlayer();
        assertEquals('X', 'O');
        assertEquals('O', 'X');
    }

    /**
     * Test of MakeMove method, of class QA_Lab9.
     */
    @Test
    public void testMakeMove() {
        System.out.println("MakeMove");
        QA_Lab9.MakeMove();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class QA_Lab9.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        QA_Lab9.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

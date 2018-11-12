/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import codewars_playing_with_digits.DigPow;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alfa
 */
public class DigPowTest {

    public DigPowTest() {
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

    @Test
    public void Test1() {
        assertEquals(1, DigPow.digPow(89, 1));
    }

    @Test
    public void Test2() {
        assertEquals(-1, DigPow.digPow(92, 1));
    }

    @Test
    public void Test3() {
        assertEquals(51, DigPow.digPow(46288, 3));
    }
}

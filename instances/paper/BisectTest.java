/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paper;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>
 */
public class BisectTest {

    /**
     * Test of setEpsilon method, of class Bisect.
     */
    @Test
    public void testSetEpsilon() {
        System.out.println("setEpsilon");
        double epsilon = 0.0;
        Bisect instance = new Bisect();
        instance.setEpsilon(epsilon);
        assertTrue(true);
    }

    /**
     * Test of sqrt method, of class Bisect.
     */
    @Test
    public void testSqrt() {
        System.out.println("sqrt");
        double N = 0.0;
        Bisect instance = new Bisect();
        double expResult = 0.0;
        double result = instance.sqrt(N);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of sqrt and setEpsilon methods, of class Bisect.
     */
    @Test
    public void testSetEpsilonSqrt() {
        System.out.println("SetEpsilon and sqrt");
        double N = 0.0;
        Bisect instance = new Bisect();
        instance.setEpsilon(N);
        double expResult = 0.0;
        double result = instance.sqrt(N);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testTS_1_1() {
        System.out.println("testTS_1_1");
        Bisect instance = new Bisect();
        double arg1 = 0.1;
        instance.setEpsilon(arg1);
        double arg2 = 5;
        assertEquals(instance.sqrt(arg2), 2.25, 0.001);
    }

    @Test
    public void testTS_1_2() {
        System.out.println("testTS_1_2");
        Bisect instance = new Bisect();
        double arg1 = 0.1;
        instance.setEpsilon(arg1);
        double arg2 = 3;
        assertEquals(instance.sqrt(arg2), 1.75, 0.001);
    }

    @Test
    public void testTS_1_3() {
        System.out.println("testTS_1_3");
        Bisect instance = new Bisect();
        double arg1 = 0.1;
        instance.setEpsilon(arg1);
        double arg2 = 0.0000001;
        assertEquals(instance.sqrt(arg2), 1.0E-7, 0.001);
    }

    @Test
    public void testTS_1_4() {
        System.out.println("testTS_1_4");
        Bisect instance = new Bisect();
        double arg1 = 0.1;
        instance.setEpsilon(arg1);
        double arg2 = 2;
        assertEquals(instance.sqrt(arg2), 1.4375, 0.001);
    }

    @Test
    public void testTS_1_5() {
        System.out.println("testTS_1_5");
        Bisect instance = new Bisect();
        double arg1 = 0.1;
        instance.setEpsilon(arg1);
        double arg2 = 4;
        assertEquals(instance.sqrt(arg2), 1.984375, 0.001);
    }

    @Test
    public void testTS_1_6() {
        System.out.println("testTS_1_6");
        Bisect instance = new Bisect();
        double arg1 = 5;
        instance.setEpsilon(arg1);
        double arg2 = 5;
        assertEquals(instance.sqrt(arg2), 3.0, 0.001);
    }

    @Test
    public void testTS_1_7() {
        System.out.println("testTS_1_7");
        Bisect instance = new Bisect();
        double arg1 = 5;
        instance.setEpsilon(arg1);
        double arg2 = 3;
        assertEquals(instance.sqrt(arg2), 2.0, 0.001);
    }

    @Test
    public void testTS_1_8() {
        System.out.println("testTS_1_8");
        Bisect instance = new Bisect();
        double arg1 = 5;
        instance.setEpsilon(arg1);
        double arg2 = 0.0000001;

        assertEquals(instance.sqrt(arg2), 0.0, 0.001);
    }

    @Test
    public void testTS_1_9() {
        System.out.println("testTS_1_9");
        Bisect instance = new Bisect();

        double arg1 = 5;
        instance.setEpsilon(arg1);
        double arg2 = 2;

        assertEquals(instance.sqrt(arg2), 2.0, 0.001);
    }

    @Test
    public void testTS_1_10() {
        System.out.println("testTS_1_10");
        Bisect instance = new Bisect();

        double arg1 = 5;
        instance.setEpsilon(arg1);
        double arg2 = 4;

        assertEquals(instance.sqrt(arg2), 2.5, 0.001);
    }

    @Test
    public void testTS_1_11() {
        System.out.println("testTS_1_11");
        Bisect instance = new Bisect();

        double arg1 = 0.00001;
        instance.setEpsilon(arg1);
        double arg2 = 5;

        assertEquals(instance.sqrt(arg2), 2.2360687255859375, 0.001);
    }

    @Test
    public void testTS_1_12() {
        System.out.println("testTS_1_12");
        Bisect instance = new Bisect();

        double arg1 = 0.00001;
        instance.setEpsilon(arg1);
        double arg2 = 3;

        assertEquals(instance.sqrt(arg2), 1.7320480346679688, 0.001);
    }

    @Test
    public void testTS_1_13() {
        System.out.println("testTS_1_13");
        Bisect instance = new Bisect();

        double arg1 = 0.00001;
        instance.setEpsilon(arg1);
        double arg2 = 0.0000001;

        assertEquals(instance.sqrt(arg2), 1.0E-7, 0.001);
    }

    @Test
    public void testTS_1_14() {
        System.out.println("testTS_1_14");
        Bisect instance = new Bisect();

        double arg1 = 0.00001;
        instance.setEpsilon(arg1);
        double arg2 = 2;

        assertEquals(instance.sqrt(arg2), 1.414215087890625, 0.001);
    }

    @Test
    public void testTS_1_15() {
        System.out.println("testTS_1_15");
        Bisect instance = new Bisect();

        double arg1 = 0.00001;
        instance.setEpsilon(arg1);
        double arg2 = 4;

        assertEquals(instance.sqrt(arg2), 2.000001907348633, 0.001);
    }

    @Test
    public void testTS_1_16() {
        System.out.println("testTS_1_16");
        Bisect instance = new Bisect();

        double arg1 = 2;
        instance.setEpsilon(arg1);
        double arg2 = 5;

        assertEquals(instance.sqrt(arg2), 2.0, 0.001);
    }

    @Test
    public void testTS_1_17() {
        System.out.println("testTS_1_17");
        Bisect instance = new Bisect();

        double arg1 = 2;
        instance.setEpsilon(arg1);
        double arg2 = 3;

        assertEquals(instance.sqrt(arg2), 2.0, 0.001);
    }

    @Test
    public void testTS_1_18() {
        System.out.println("testTS_1_18");
        Bisect instance = new Bisect();

        double arg1 = 2;
        instance.setEpsilon(arg1);
        double arg2 = 0.0000001;

        assertEquals(instance.sqrt(arg2), 1.0E-7, 0.001);
    }

    @Test
    public void testTS_1_19() {
        System.out.println("testTS_1_19");
        Bisect instance = new Bisect();

        double arg1 = 2;
        instance.setEpsilon(arg1);
        double arg2 = 2;

        assertEquals(instance.sqrt(arg2), 2.0, 0.001);
    }

    @Test
    public void testTS_1_20() {
        System.out.println("testTS_1_20");
        Bisect instance = new Bisect();

        double arg1 = 2;
        instance.setEpsilon(arg1);
        double arg2 = 4;

        assertEquals(instance.sqrt(arg2), 1.75, 0.001);
    }

    @Test
    public void testTS_1_21() {
        System.out.println("testTS_1_21");
        Bisect instance = new Bisect();

        double arg1 = 4;
        instance.setEpsilon(arg1);
        double arg2 = 5;

        assertEquals(instance.sqrt(arg2), 3.0, 0.001);
    }

    @Test
    public void testTS_1_22() {
        System.out.println("testTS_1_22");
        Bisect instance = new Bisect();

        double arg1 = 4;
        instance.setEpsilon(arg1);
        double arg2 = 3;

        assertEquals(instance.sqrt(arg2), 2.0, 0.001);
    }

    @Test
    public void testTS_1_23() {
        System.out.println("testTS_1_23");
        Bisect instance = new Bisect();

        double arg1 = 4;
        instance.setEpsilon(arg1);
        double arg2 = 0.0000001;

        assertEquals(instance.sqrt(arg2), 1.0E-7, 0.001);
    }

    @Test
    public void testTS_1_24() {
        System.out.println("testTS_1_24");
        Bisect instance = new Bisect();

        double arg1 = 4;
        instance.setEpsilon(arg1);
        double arg2 = 2;

        assertEquals(instance.sqrt(arg2), 2.0, 0.001);
    }

    @Test
    public void testTS_1_25() {
        System.out.println("testTS_1_25");
        Bisect instance = new Bisect();

        double arg1 = 4;
        instance.setEpsilon(arg1);
        double arg2 = 4;

        assertEquals(instance.sqrt(arg2), 2.5, 0.001);
    }
}

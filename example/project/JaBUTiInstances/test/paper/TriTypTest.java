package paper;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test Class for TriTyp Project
 *
 * @author Jackson Antonio do Prado Lima
 * @author Vinicius Renan de Carvalho
 * @since 2016-04-27
 * @version 1.1
 */
public class TriTypTest {
   
    /**
     * Test not a triangle type
     */
    @Test
    public void testCase1() {        
        TriTyp instance = new TriTyp();
        instance.setI(-10);
        instance.setJ(10);
        instance.setK(10);
        instance.type();
        Assert.assertEquals(TriTyp.NOT_A_TRIANGLE, instance.trityp);
    }

    /**
     * Test scalene type
     */
    @Test
    public void testCase2() {        
        TriTyp instance = new TriTyp();
        instance.setI(10);
        instance.setJ(9);
        instance.setK(8);
        instance.type();
        Assert.assertEquals(TriTyp.SCALENE, instance.trityp);
    }
}

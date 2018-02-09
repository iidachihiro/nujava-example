package jp.mzw.nujava.example;

import org.junit.Assert;
import org.junit.Test;

public class ArrayExampleTest {
    @Test
    public void test1() {
        ArrayExample ae = new ArrayExample();
        Assert.assertEquals(ae.getElement(3), 4);
    }
    
    @Test
    public void test2() {
        ArrayExample ae = new ArrayExample();
        Assert.assertEquals(ae.getLength(),  5);
    }
    
    @Test
    public void test3() {
        ArrayExample ae = new ArrayExample();
        Assert.assertEquals(ae.getFirstIndex(4),  1);
    }
    
    @Test
    public void test4() {
        ArrayExample ae = new ArrayExample();
        Assert.assertEquals(ae.getFirstIndex(10),  5);
    }
}

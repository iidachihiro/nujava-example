package jp.mzw.nujava.example;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {
    @Test
    public void testA() {
        LeapYear ly = new LeapYear();
        Assert.assertEquals(true, ly.isLeapYear(2000));
    }
}

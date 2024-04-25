package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class LoopsTest {

    @Test
    public void testSumOfFirstNNumbers() {
        Assert.assertEquals(10, Loops.sumOfNumbers(4));
        Assert.assertEquals(0, Loops.sumOfNumbers(0));
        Assert.assertEquals(55, Loops.sumOfNumbers(10));
        Assert.assertEquals(78, Loops.sumOfNumbers(12));
        Assert.assertEquals(105, Loops.sumOfNumbers(14));
        Assert.assertEquals(171, Loops.sumOfNumbers(18));
        Assert.assertEquals(253, Loops.sumOfNumbers(22));
        Assert.assertEquals(276, Loops.sumOfNumbers(23));
        Assert.assertEquals(325, Loops.sumOfNumbers(25));
        Assert.assertEquals(465, Loops.sumOfNumbers(30));
        Assert.assertEquals(528, Loops.sumOfNumbers(32));
        Assert.assertEquals(561, Loops.sumOfNumbers(33));
        Assert.assertEquals(595, Loops.sumOfNumbers(34));
        Assert.assertEquals(630, Loops.sumOfNumbers(35));
        Assert.assertEquals(666, Loops.sumOfNumbers(36));
        Assert.assertEquals(703, Loops.sumOfNumbers(37));
        Assert.assertEquals(741, Loops.sumOfNumbers(38));
        Assert.assertEquals(780, Loops.sumOfNumbers(39));
        Assert.assertEquals(820, Loops.sumOfNumbers(40));
    }
    
    @Test
    public void testSumOfLargeNNumbers() {
        Assert.assertEquals(5050, Loops.sumOfNumbers(100));
        Assert.assertEquals(20100, Loops.sumOfNumbers(200));
        Assert.assertEquals(45150, Loops.sumOfNumbers(300));
        Assert.assertEquals(80200, Loops.sumOfNumbers(400));
        Assert.assertEquals(125250, Loops.sumOfNumbers(500));
      
    }


    @Test
    public void testCheckNumbersUpToN() {
        Assert.assertEquals("Odd Even Odd Even", Loops.checkNumbersUpToN(4));
        Assert.assertEquals("", Loops.checkNumbersUpToN(0));
        Assert.assertEquals("Odd Even", Loops.checkNumbersUpToN(2));
        
    }
    @Test
    public void testCheckNumbersUpToNEven() {
        Assert.assertEquals("Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even", Loops.checkNumbersUpToN(16));
        Assert.assertEquals("Odd Even", Loops.checkNumbersUpToN(2));
        Assert.assertEquals("Odd Even Odd Even Odd Even", Loops.checkNumbersUpToN(6));
        Assert.assertEquals("Odd Even Odd Even Odd Even Odd Even", Loops.checkNumbersUpToN(8));
        Assert.assertEquals("Odd Even Odd Even Odd Even Odd Even Odd Even", Loops.checkNumbersUpToN(10));
        Assert.assertEquals("Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even", Loops.checkNumbersUpToN(12));
        Assert.assertEquals("Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even", Loops.checkNumbersUpToN(14));
        Assert.assertEquals("Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even", Loops.checkNumbersUpToN(16));
        Assert.assertEquals("Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even", Loops.checkNumbersUpToN(18));
        Assert.assertEquals("Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even", Loops.checkNumbersUpToN(20));
        
    }
    @Test
    public void testCheckNumbersUpToNOdd() {
        Assert.assertEquals("Odd Even Odd", Loops.checkNumbersUpToN(3));
        Assert.assertEquals("Odd Even Odd Even Odd", Loops.checkNumbersUpToN(5));
        Assert.assertEquals("Odd Even Odd Even Odd Even Odd", Loops.checkNumbersUpToN(7));
        Assert.assertEquals("Odd Even Odd Even Odd Even Odd Even Odd", Loops.checkNumbersUpToN(9));
        Assert.assertEquals("Odd Even Odd Even Odd Even Odd Even Odd Even Odd", Loops.checkNumbersUpToN(11));
        Assert.assertEquals("Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd", Loops.checkNumbersUpToN(13));
        Assert.assertEquals("Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd", Loops.checkNumbersUpToN(15));
        Assert.assertEquals("Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd", Loops.checkNumbersUpToN(17));
        Assert.assertEquals("Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd Even Odd", Loops.checkNumbersUpToN(19));
        
    }
    
    @Test
    public void testSumOfNumbers_NegativeInput() {
        Assert.assertEquals(0, Loops.sumOfNumbers(-1));  
    }
    
    @Test
    public void testCheckNumbersUpToN_NegativeInput() {
        Assert.assertEquals("", Loops.checkNumbersUpToN(-1));  
    }
    
    @Test
    public void testCheckNumbersAtBoundary() {
    Assert.assertEquals("Odd Even Odd", Loops.checkNumbersUpToN(3));
    Assert.assertEquals("Odd Even Odd Even", Loops.checkNumbersUpToN(4)); 
    
}
    
}
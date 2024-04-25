package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "216293263";
		Assert.assertNotNull("216293263", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Mark Przybylkiewicz";
		Assert.assertNotNull("Mark Przybylkiewicz", studentName);
	}
	
	@Test
	public void testFalseNumberIsEven() {
		Assert.assertFalse(WeatherAndMathUtils.isEven(5));
	}
	
	@Test
	public void testAllClearWeatherAdvice() {
	     Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(44.0, 3.9));
	     Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(0.0, 0.0));
	}

	
	@Test
	public void testWarnWeatherAdvice() {
	    Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(45.1, 3.0));
	    Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(30.0, 4.1));
	}
	
    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(50.0, 6.1));
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(46.0, 4.1));

    }
    
    
    @Test
    public void testIsPrimePrimeNumbers() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(2));
        Assert.assertTrue(WeatherAndMathUtils.isPrime(3));
        Assert.assertTrue(WeatherAndMathUtils.isPrime(5));
        Assert.assertTrue(WeatherAndMathUtils.isPrime(7));
    }

    @Test
    public void testIsPrimeCompositeNumbers() {
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4));
        Assert.assertFalse(WeatherAndMathUtils.isPrime(6));
        Assert.assertFalse(WeatherAndMathUtils.isPrime(8));
        Assert.assertFalse(WeatherAndMathUtils.isPrime(18));
        Assert.assertFalse(WeatherAndMathUtils.isPrime(44));
        Assert.assertFalse(WeatherAndMathUtils.isPrime(84));
        Assert.assertFalse(WeatherAndMathUtils.isPrime(96));
    }

    @Test
    public void testIsPrimeOne() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(1));  
    }

    @Test
    public void testIsPrimeLargeNumber() {
        Assert.assertFalse(WeatherAndMathUtils.isPrime(100));
        Assert.assertTrue(WeatherAndMathUtils.isPrime(97)); 
        Assert.assertTrue(WeatherAndMathUtils.isPrime(95)); 
        Assert.assertTrue(WeatherAndMathUtils.isPrime(105)); 
        Assert.assertTrue(WeatherAndMathUtils.isPrime(147)); 
        Assert.assertTrue(WeatherAndMathUtils.isPrime(231)); 
    }
}

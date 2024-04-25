package sit707_week6;

public class Loops {

    // Function with a simple conditional loop
	public static int sumOfNumbers(int n) {
	    if (n < 0) return 0;  // Early return for negative numbers
	    int sum = 0;
	    for (int i = 1; i <= n; i++) {
	        sum += i;
	    }
	    return sum;
	}


    // Function with a conditional loop containing a conditional statement
	public static String checkNumbersUpToN(int n) {
	    if (n < 0) return "";  
	    String result = "";
	    for (int i = 1; i <= n; i++) {
	        if (i % 2 == 0) {
	            result += "Even ";
	        } else {
	            result += "Odd ";
	        }
	    }
	    return result.trim();
	}
}
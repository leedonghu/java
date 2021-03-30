package p99.codingbat;

public class WarmUp06Solution {
	public boolean makes10(int a, int b) {
		  if ( a == 10 || b == 10) {
		    return true;
		  }
		  if (a + b == 10) {
		    return true;
		  }
		  return false;
		}

}

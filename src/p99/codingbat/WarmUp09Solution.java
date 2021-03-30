package p99.codingbat;

public class WarmUp09Solution {
	public boolean nearHundred(int n) {
		  if (Math.abs(100-n)<=10 || Math.abs(200-n) <= 10) {
		    return true;
		  }
		  return false;
		}

}

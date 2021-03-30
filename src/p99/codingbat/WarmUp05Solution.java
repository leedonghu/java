package p99.codingbat;

public class WarmUp05Solution {
	public boolean parrotTrouble(boolean talking, int hour) {
		  if (talking) {
		    if (hour <7 || hour >20) {
		      return true;
		    }
		  }
		  return false;
		}  
}

package p99.codingbat;

public class WarmUp17Solution {
	public boolean startHi(String str) {
		  if(str.length() <=1) {
		    return false;
		  } else if(str.substring(0, 2).equals("hi")){
		    return true;
		  } else{
		    return false;
		  }
		}

}

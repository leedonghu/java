package p99.codingbat;

public class WarmUp18Solution {
	public boolean icyHot(int temp1, int temp2) {
		  if(temp1 <0 && temp2 >100 || temp1 >100 && temp2 <0){
		    return true;
		  } else {
		    return false;
		  }
		}

}

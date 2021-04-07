package p99.codingbat;

public class WarmUp16Solution {
	public String front22(String str) {
		  if(str.length()>2){
		    String front = str.substring(0,2);
		    return front + str + front;
		  } else{
		    return str +str + str;
		  }
		}

}

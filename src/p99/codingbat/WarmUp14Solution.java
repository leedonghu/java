package p99.codingbat;

public class WarmUp14Solution {
	public String backAround(String str) {
		  String back;
		  if(str.length()<=1) {
		    return str+str+str;
		  } else {
		    back = str.substring(str.length()-1, str.length());
		    return back + str + back;
		  }
		}

}

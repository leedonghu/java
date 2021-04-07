package p99.codingbat;

public class WarmUp12Solution {
	public String frontBack(String str) {
		  // if(str.length() <=1){
		  //   return str;
		  // } else if(str.length() == 2) {
		  //   return str.substring(1,2) + str.substring(0,1);
		    
		  // } else{
		  //   return str.substring(str.length()-1,str.length()) + str.substring(1,str.length()-1) + str.substring(0,1);
		  // }
		  
		  
		  // if(str.length() <=1) {
		  //   return str;
		  // } else{
		  //   String front = str.substring(0, 1);
		  //   String back = str.substring(str.length()-1, str.length());
		  //   String middle = str.substring(1, str.length()-1);
		  //   return back + middle + front;
		  // }
		  
		  if(str.length()>1){
		     char front = str.charAt(0);
		  char last = str.charAt(str.length()-1);
		  String mid = str.substring(1, str.length()-1);
		  return last + mid + front;
		  }
		  return str;
		  
		}
}

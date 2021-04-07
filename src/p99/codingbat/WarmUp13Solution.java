package p99.codingbat;

public class WarmUp13Solution {
	public String front3(String str) {
		  // if(str.length() == 0){
		  //   return str;
		  // } else if(str.length() <= 2) {
		  //   return str + str + str;
		  // } else {
		  //   return str.substring(0, 3)+str.substring(0, 3)+str.substring(0, 3);
		  // }
		  
		  String front;
		  if(str.length()<=2){
		    return str+str+str;
		  } else{
		    front = str.substring(0, 3);
		    return front + front+ front;
		  }
		}

}

package p99.codingbat;

public class WarmUp11Solution {
	public String missingChar(String str, int n) {
		 String a = str.substring(0, n);
		 String b = str.substring(n+1, str.length());
		 return a+b;
		}

}

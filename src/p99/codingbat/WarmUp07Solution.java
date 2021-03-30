package p99.codingbat;

public class WarmUp07Solution {
	public int diff21(int n) {
		if (n < 22) {
			return 21 - n;
		} else {
			return (n - 21) * 2;
		}
	}
}

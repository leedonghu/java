package p06.lecture.p4method;

public class MyClass8 {
	int max(int... i) {
		int max = 0;
		if (i.length == 1) {
			return i[0];
		} else if (i.length == 0) {
			return 0;

		} else {
			for (int k = 0; k < i.length; k++) {

				if (i[0] < i[k]) {
					max = i[k];
				}

			}
		}
		return max;

	}
}

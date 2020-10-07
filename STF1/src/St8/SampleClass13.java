package St8;


public class SampleClass13 {
	int[] data = new int[7];
	String A = "*";
	public SampleClass13() {
		System.out.println("問題10");
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 10) +1;
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < data.length; i++) {
			if (data[i] == 0) {
				System.out.println("");
			} else if (data[i] == 1) {
				System.out.println("*");
			} else if (data[i] == 2) {
				System.out.println("**");
			} else if (data[i] == 3) {
				System.out.println("***");
			} else if (data[i] == 4) {
				System.out.println("****");
			} else if (data[i] == 5) {
				System.out.println("*****");
			} else if (data[i] == 6) {
				System.out.println("******");
			} else if (data[i] == 7) {
				System.out.println("*******");
			} else if (data[i] == 8) {
				System.out.println("********");
			} else if (data[i] == 9) {
				System.out.println("*********");
			} else {
				System.out.println("**********");
			}
		}
	}

}

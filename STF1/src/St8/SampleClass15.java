package St8;

public class SampleClass15 {
	int[][] data = new int[3][3];
	public SampleClass15() {
		System.out.println("問題12");
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				data[i][j] = (int) (Math.random() * 9) + 1;
			}
		}
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (i == 0) {
					System.out.print(data[i][j] + " ");
				}
			}
		}
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (i == 1) {
					System.out.print(data[i][j] + " ");
				}
			}
		}
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (i == 2) {
					System.out.print(data[i][j] + " ");
				}
			}
		}
		System.out.println();
	}

}

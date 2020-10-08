package St8;

public class SampleClass16 {
	int[][] data = new int[3][3];
	int Max = 0;
	int Min = 9;
	public SampleClass16() {
		System.out.println("問題13");
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

		System.out.print("最大値 : ");
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (Max < data[i][j]) {
					Max = data[i][j];
				}
			}
		}
		System.out.println(Max);

		System.out.print("最小値 : ");
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (Min > data[i][j]) {
					Min = data[i][j];
				}
			}
		}
		System.out.println(Min);
	}

}

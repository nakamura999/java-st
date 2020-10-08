package St8;

public class SampleClass14 {
	int[] data = new int[5];
	public SampleClass14() {
		System.out.println("問題11");
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();

		System.out.print("0以上60未満 : ");
		for (int i = 0; i < data.length; i++) {
			if (0 <= data[i] && data[i] < 60) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();

		System.out.print("60以上80未満 : ");
		for (int i = 0; i < data.length; i++) {
			if (60 <= data[i] && data[i] < 80) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();

		System.out.print("80以上 : ");
		for (int i = 0; i < data.length; i++) {
			if (80 <= data[i]) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
	}

}

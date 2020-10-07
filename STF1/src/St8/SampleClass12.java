package St8;

public class SampleClass12 {
	int[] data = new int[10];
	public SampleClass12() {
		System.out.println("問題9");
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 100) +1;
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();

		System.out.print("50以上の数 : ");
		for (int i = 0; i < data.length; i++) {
			if (50 <= data[i]) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();

		System.out.print("50未満の数 : ");
		for (int i = 0; i < data.length; i++) {
			if (50 > data[i]) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
	}

}

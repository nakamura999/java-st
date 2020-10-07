package St8;

public class SampleClass10 {
	int[] data = new int[5];
	int Sum = 0;
	int Ave = 0;
	int Amax = data[0];
	int Amin = 10;
	public SampleClass10() {
		System.out.println("問題7");
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 10) +1;
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < data.length; i++) {
			Sum += data[i];
			Ave = Sum / data.length;
		}
		System.out.println("合計値 : " + Sum);
		System.out.println("平均値 : " + Ave);

		System.out.print("平均値より大きい数 : ");
		for (int i = 0; i < data.length; i++) {
			if (Ave < data[i]) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();

		System.out.print("平均値より小さい数 : ");
		for (int i = 0; i <data.length; i++) {
			if (Ave > data[i]) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
	}

}

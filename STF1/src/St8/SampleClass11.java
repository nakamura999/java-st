package St8;

public class SampleClass11 {
	int[] data = new int[5];
	int Max = 0;
	int Min = 0;
	int Zero = 0;
	public SampleClass11() {
		System.out.println("問題8");
		for (int i = 0; i < data.length; i++) {
			// ランダム-10~10
			data[i] = (int) (Math.random() * (20+1)) - 10;
		}
		for (int i = 0; i <data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();

		System.out.print("0より大きい数 : ");
		for (int i = 0; i < data.length; i++) {
			if (0 < data[i]) {
				data[i] = 1;
				Max += data[i];
			}
		}
		System.out.println(Max);

		System.out.print("0より小さい数 : ");
		for (int i = 0; i < data.length; i++) {
			if (0 > data[i]) {
				data[i] = 1;
				Min += data[i];
			}
		}
		System.out.println(Min);

		System.out.print("0の個数 : ");
		for (int i = 0; i < data.length; i++) {
			if (0 == data[i]) {
				data[i] = 1;
				Zero += data[i];
			}
		}
		System.out.println(Zero);
	}

}

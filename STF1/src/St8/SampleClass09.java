package St8;

public class SampleClass09 {
	int[] data = new int[10];
	int Max = data[0];
	int Min = 100;
	int Sum = 0;
	int Ave = 0;
	public SampleClass09() {
		System.out.println("問題6");
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < data.length; i++) {
			if (Max < data[i]) {
				Max = data[i];
			}
		}
		System.out.println("最大値 : " + Max);

		for (int i = 0; i < data.length; i++) {
			if (Min > data[i]) {
				Min = data[i];
			}
		}
		System.out.println("最小値 : " + Min);

		for (int i = 0; i < data.length; i++) {
			Sum += data[i];
			Ave = Sum / data.length;
		}
		System.out.println("合計値 : " + Sum);
		System.out.println("平均値 : " + Ave);
	}

}

package st2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bicycle bicycle1 = new Bicycle("ビアンキ", "緑");
		System.out.println("[自転車の情報]");
//		System.out.println("名前: " + bicycle.getName());
		bicycle1.printData();
		System.out.println("------------");
		System.out.println("走る走行距離を入力してください");
		int n = scanner.nextInt();
		bicycle1.run(n);
//		bicycle1.run(10);

		System.out.println("============");
		Car car1 = new Car("フェラーリ", "レッド");
		System.out.println("[車の情報]");
		car1.printData();
		System.out.println("-------------");
		System.out.println("走る距離を入力してください : ");
		int carRun = scanner.nextInt();
		car1.run(carRun);
		System.out.println("-------------");
		System.out.println("給油する量を入力してください : ");
		int chargeFuel = scanner.nextInt();
		car1.charge(chargeFuel);
	}
}

// 継承
package st1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Car car = new Car("フェラーリ", "赤");
//		car.setName("フェラーリ");
//		car.setColor("赤");

		Bicycle bicycle = new Bicycle("ビアンキ", "緑");
//		bicycle.setName("ビアンキ");
//		bicycle.setColor("緑");

		System.out.println("[車の情報]");
		car.printData();
		System.out.println("-------------");
		System.out.println("走る距離を入力してください : ");
		int carDistance = scanner.nextInt();
		car.run(carDistance);
		System.out.println("給油する量を入力してください : ");
		int litre = scanner.nextInt();
		car.charge(litre);

		System.out.println("===========");
		System.out.println("[自動車の情報]");
		bicycle.printData();
		System.out.println("-------------");
		System.out.println("走る距離を入力してください : ");
		int bicycleDistance = scanner.nextInt();
		bicycle.run(bicycleDistance);
	}

}

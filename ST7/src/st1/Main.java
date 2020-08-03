// 継承
package st1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Car car = new Car();
		car.setName("フェラーリ");
		car.setColor("赤");

		Bicycle bicycle = new Bicycle();
		bicycle.setName("ビアンキ");
		bicycle.setColor("緑");

		System.out.println("[車の情報]");
		System.out.println("ガソリンの量" + car.getFuel() + "L");
		System.out.println("-------------");
		System.out.println("給油する量を入力してください : ");
		int litre = scanner.nextInt();
		car.charge(litre);
//		car.printData();

		System.out.println("===========");
		System.out.println("[自動車の情報]");
		bicycle.printData();
	}

}

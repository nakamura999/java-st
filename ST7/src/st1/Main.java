// 継承
package st1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("田中", "涼", 30, 1.6, 50.0);
		Person person2 = new Person("John", "Chistopher", "Smith", 65, 1.75, 80.0);

		Scanner scanner = new Scanner(System.in);
		Car car = new Car("フェラーリ", "赤");
		car.setOwner(person1);
//		car.setName("フェラーリ");
//		car.setColor("赤");

		Bicycle bicycle = new Bicycle("ビアンキ", "緑");
		bicycle.setOwner(person2);
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
		car.getOwner().printData();

		System.out.println("===========");
		System.out.println("[自動車の情報]");
		bicycle.printData();
		System.out.println("-------------");
		System.out.println("走る距離を入力してください : ");
		int bicycleDistance = scanner.nextInt();
		bicycle.run(bicycleDistance);
		bicycle.getOwner().printData();
	}

}

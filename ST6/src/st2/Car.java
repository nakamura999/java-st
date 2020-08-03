package st2;

public class Car {
	private String name;
	private String color;
	private int distance = 0;
	private int fuel = 100;

	// インスタンスの生成時にフィールドに値をセットできるよう、コンストラクタを用意
	Car(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return this.name;
	}

	public void printData() {
		System.out.println("バイクの名前は" + this.name + "です");
		System.out.println("色 : " + this.color);
		System.out.println("走行距離 : " + this.distance + "km");
		System.out.println("ガソリン量 : " + this.fuel + "L");
	}

	public void run(int run) {
		System.out.println(run + "km走ります");
		if (run <= this.fuel) {
			this.distance += run;
			this.fuel -= run;
		} else {
			System.out.println("ガソリンがたりません");
		}
		System.out.println("走行距離 : " + this.distance + "km");
		System.out.println("ガソリン量 : " + this.fuel + "L");
	}

	public void charge(int charge) {
		System.out.println(charge + "L給油します");
		if (charge <= 0) {
			System.out.println("給油できません");
		} else if (charge + this.fuel >= 100) {
			System.out.println("満タンまで給油します");
			this.fuel = 100;
		} else {
			this.fuel += charge;
		}
		System.out.println("ガソリン量 : " + this.fuel + "L");
	}
}

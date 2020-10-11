package St5;

public class Car {
	private int fuel = 0; //燃料
	private int migration = 0; // 移動距離
	public Car () {
		System.out.println("Carオブジェクト生成");
	}

	public void move() {
		if(fuel >= 0) {
			migration++; // 移動距離
			fuel--; // 燃料消費
		}
		System.out.println("走行距離 : " + migration);
		System.out.println("燃料 : " + fuel);
	}

	public void supply(int fuel) {
		if(fuel > 0) {
			this.fuel += fuel; // 燃料補給
		}
		System.out.println("燃料 : " + fuel);
	}
}

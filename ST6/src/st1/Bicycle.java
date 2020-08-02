package st1;

public class Bicycle {
	private String name;
	private String color;
	private int distance = 0;

	// インスタンスの生成時にフィールドに値をセットできるよう、コンストラクタを用意
	Bicycle(String name, String color) {
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
	}

}

package st2;

public class Computer {
	private String name;
	private int price;
	private String color;
	private String makerName;

	public Computer(String name, int price, String color, String makerName) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.makerName = makerName;
	}
	public String getName() { return this.name;}
	public int price() { return this.price; }

}

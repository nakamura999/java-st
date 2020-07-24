package st2;

public class Computer extends TagibleAsset {
	private String name;
	private int price;
	private String color;
	private String makerName;

	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}
	public String getMakerNmae() { return this.makerName; }
}

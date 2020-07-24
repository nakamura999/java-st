package st2;

public abstract class TagibleAsset {
	private String name;
	private int price;
	private String color;
	public TagibleAsset(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
	public String getName() { return this.name; }
	public int getPrice() { return this.price; }
	public String getColor() { return this.color; }
}

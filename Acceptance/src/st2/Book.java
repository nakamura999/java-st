package st2;

public class Book extends TagibleAsset {
	private String name;
	private int price;
	private String color;
	private String isbn;
	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}
	public String getIsbn() { return this.isbn; }
}

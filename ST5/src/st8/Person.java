package st8;

public class Person {
	public String name;
	Person(String name) {
		System.out.println("インスタンスが生成されました");
		this.name = name;
	}

	public void hello() {
		System.out.println("こんにちは" + this.name + "です");
	}

}

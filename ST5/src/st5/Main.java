// インスタンスフィールド
package st5;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.hello();

		person1.name = "田中";

		System.out.println("名前は" + person1.name + "です");

		Person person2 = new Person();
		person2.hello();

		person2.name = "佐藤　武";

		System.out.println("名前は" + person2.name + "です");
	}

}

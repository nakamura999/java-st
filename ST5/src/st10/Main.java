// フィールドとコンストラクタ
package st10;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("田中", "景", 30, 1.6, 50.0);

		System.out.println(person1.firstName);
		System.out.println(person1.lastName);
		System.out.println(person1.age);
		System.out.println(person1.height);
		System.out.println(person1.weight);

	}
}

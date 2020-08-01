// インスタンスメソッド
package st11;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("田中", "景", 30, 1.6, 50.0);

		System.out.println(person1.fullName());
		System.out.println(person1.age);
		System.out.println(person1.bmi());

	}

}

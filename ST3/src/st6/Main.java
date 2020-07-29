// メソッドのオーバーロード
package st6;

public class Main {
	public static void main(String[] args) {
		printData(fullName("田中", "二郎"), 27);

		printData(fullName("佐藤", "涼", "さん"), 30);
	}

	public static void printData(String name, int age) {
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "です");
	}

	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	public static String fullName(String firstName, String lastName, String san) {
		return firstName + " " +lastName + " " + san;
	}


}

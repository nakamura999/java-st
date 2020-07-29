package st5;

public class Main {
	public static void main(String[] args) {
		String name = fullName("田中", "一郎");

		printData(name, 30);

		printData("佐藤", 27);
	}
	public static void printData(String name, int age) {
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "です");
	}

	public static String fullName(String firstName, String lastName) {
		return firstName + "" + lastName;
	}


}

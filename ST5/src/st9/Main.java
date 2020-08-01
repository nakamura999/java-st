package st9;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("田中", "一郎", 30, 1.6, 50.0);
		person1.printData();

		Person person2 = new Person("John", "Chisto@pher", "Smith", 65, 1.75, 80.0);
		person2.printData();

		Person.printCount();

	}

}

package st13;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("田中", "景", 30, 1.6, 50.0);
		person1.printData();

		Person person2 = new Person("John", "Smith", 65, 1.75, 80.0);
		person2.printData();

		System.out.println("合計" + Person.count + "人です");
	}


}

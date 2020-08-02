package st21;


public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("田中", "景", 30, 1.6, 50.0, "医者");
		person1.printData();

		Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0, "大工");
		person2.printData();

		Person.printCount();

		person2.setJob("教授");

		// person2のmiddleNameフィールドの値
		person2.setMiddleName("Chris");

		System.out.println("person2のミドルネームは" + person2.getMiddleName() + "です");
		System.out.println("person2の仕事は" + person2.getJob() + "です");
	}
}

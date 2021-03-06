package st20;

public class Person {
	private static int count = 0;
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private double height, weight;

	Person(String firstName, String lastName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	Person(String firstName,String middleName, String lastName, int age, double height, double weight) {
		this(firstName, lastName, age, height, weight);
		this.middleName = middleName;
	}

	public String fullName() {
		// middleNameがない場合とある場合で条件分岐
		if (this.middleName == null) {
			return this.firstName + this.lastName;
		} else {
			return this.firstName + " " + this.middleName + " " + this.lastName;
		}
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// middleNameフィールドのゲッター
	public String getMiddleName() {
		return this.middleName;
	}

	// middleNameフィールドのセッターを定義
	public String setMiddleName(String middleName) {
		return this.middleName = middleName;
	}

	public void printData() {
		System.out.println("私の名前は" + this.fullName() + "です");
		System.out.println("年齢は" + this.age + "です");
		System.out.println("BMI" + Math.round(this.bmi()) + "です");
	}
	// クラスメソッドprintCount()
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}

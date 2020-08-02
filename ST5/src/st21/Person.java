package st21;

public class Person {
	private static int count = 0;
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private double height, weight;
	private String job;

	Person(String firstName, String lastName, int age, double height, double weight, String job) {
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.job = job;
	}

	Person(String firstName,String middleName, String lastName, int age, double height, double weight, String job) {
		this(firstName, lastName, age, height, weight, job);
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

	public String getJob() {
		return this.job;
	}
	public String setJob(String job) {
		return this.job = job;
	}

	public void printData() {
		System.out.println("私の名前は" + this.fullName() + "です");
		System.out.println("年齢は" + this.age + "です");
		System.out.println("BMI" + Math.round(this.bmi()) + "です");
		System.out.println("仕事は" + this.job + "をしています");
	}
	// クラスメソッドprintCount()
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}

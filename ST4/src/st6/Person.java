package st6;

public class Person {
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	public static void printData(String firstName, String lastName, int age, double height, double weight) {
		System.out.println("私の名前は" + fullName(firstName, lastName) + "です");
		System.out.println("年齢は" + age + "才です");
		if (age >= 20) {
			System.out.println("成年者です");
		} else {
			System.out.println("未成年者です");
		}
		System.out.println("身長は" + height + "です");
		System.out.println("体重は" + weight + "です");
		System.out.println("BMIは" + Math.round(bmi(height, weight)) + "です");
	}

	public static double bmi(double height, double weight) {
		return weight / height / height;
	}

}

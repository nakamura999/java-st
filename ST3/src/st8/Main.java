// 真偽値の戻り値

package st8;

public class Main {
	public static void main(String[] args) {
		printData(fullName("田中", "一郎"), 30, 1.6, 50.0);
		printData(fullName("佐藤", "涼"), 29, 1.21, 80.0);
	}

	public static void printData(String name, int age, double height, double weight) {
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "です");
		System.out.println("身長は" + height + "mです");
		System.out.println("体重は" + weight + "kgです");

		double bmi = bmi(height,weight);
	    // bmiメソッド

		System.out.println("BMI" + bmi + "です");
		if (isHealthy(bmi) == true) {
			System.out.println("健康です");
		} else {
			System.out.println("不健康です");
		}
	}
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	public static double bmi(double height,double weight) {
		return weight / height / height;
	}
	public static boolean isHealthy(double bmi) {
		return bmi >= 18.5 && bmi < 25.0;
	}

}

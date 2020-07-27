package st10;

public class Main {
	public static void main(String[] args) {
		String name = "tanaka";
		int age = 30;
		double height = 1.7;
		double weight = 60;
		double bmi = weight / height / height;
		System.out.println("名前は" + name + "です");
		System.out.println("年齢は" + age + "です");
		System.out.println("身長は" + height + "mです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("BMIは" + bmi + "です");
	}

}

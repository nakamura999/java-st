public class if2 {
	public static void main(String[] args) {
		int age = 20;
		int gender = 1;
		if ((age >= 18 && gender == 1) || (age >= 16 && gender == 0)) {
			System.out.println("洗濯をします。");
		} else {
			System.out.println("何もしません");
		}
	}
}

// && かつ　　　　|| または
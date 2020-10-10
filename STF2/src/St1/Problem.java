package St1;

public class Problem {
	public static void main(String[] args) {
		System.out.println("問題1");
		int a = (int) (Math.random() * 10) + 1;
		int b = (int) (Math.random() * 10) + 1;
		int result = add(a,b);
		int subtraction = sub(a,b);
		System.out.println("a = " + a);
		System.out.println("a = " + b);
		System.out.println(a + " + " + b + " = " + result);
		System.out.println(a + " - " + b + " = " + subtraction);
	}
	static int add(int a, int b) {
		return a + b;
	}
	static int sub(int a, int b) {
		return a - b;
	}

}

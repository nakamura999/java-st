package St2;

public class Problem {
	public static void main(String[] args) {
		System.out.println("問題2");
		int a = (int) (Math.random() * 10) + 1;
		int b = (int) (Math.random() * 10) + 1;
		int c = (int) (Math.random() * 10) + 1;
		int result = add(a,b,c);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println(a + " * " + b + " * " + c +" = " + result);
	}
	static int add(int a, int b, int c) {
		return a * b * c;
	}

}

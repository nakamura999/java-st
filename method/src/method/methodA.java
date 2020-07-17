package method;

public class methodA {
	public static void methodB() {
		System.out.println("methodB");
		methodC();
	}
	public static void methodC() {
		System.out.println("methodC");
	}
	public static void main(String[] args) {
		methodB();
	}

}

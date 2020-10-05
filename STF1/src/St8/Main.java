package St8;

public class Main {
	public static void main(String[] args) {
		SampleClass01 s1, s2;
		s1 = new SampleClass01();
		s2 = new SampleClass01();
		s1.n = 100;
		s2.n = 200;
		s1.s = "ABC";
		s2.s = "あいう";
		System.out.println(s1.add("DEF"));
		System.out.println(s2.add("えお"));
		s1.showNum();
		s2.showNum();

		System.out.println("===================");

		SampleClass02 z = new SampleClass02();
		z.method2();
		z.method3();
		// numは、privateフィールドなので外部からアクセスできない
	}
}

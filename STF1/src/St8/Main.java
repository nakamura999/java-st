package St8;

public class Main {
	public static void main(String[] args) {
		System.out.println("==SampleClass01==");
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

		System.out.println("==SampleClass02==");

		SampleClass02 a = new SampleClass02();
		a.method2();
		a.method3();
		// numは、privateフィールドなので外部からアクセスできない

		System.out.println("==SampleClass03==");

		SampleClass03 b = new SampleClass03("HelloWorld");
		b.setNumber(100);
		System.out.println(b.getNumber());
		System.out.println(b.getStr());

		System.out.println("==SampleClass04==");
		SampleClass04 c = new SampleClass04();

		System.out.println("==SampleClass05==");
		SampleClass05 d = new SampleClass05();

		System.out.println("==SampleClass06==");
		SampleClass06 e = new SampleClass06();
	}
}

package St8;

public class SampleClass02 {
	public SampleClass02() {
		System.out.println("コンストラクタ");
	}
	private void method1() {
		System.out.println("method1(private)");
	}
	public void method2() {
		System.out.println("method2(public)");
	}
	public void method3() {
		// privateメソッド呼び出し
		method1();
		System.out.println("method3(public) : num=" + this.num);
	}
	private int num = 1;

}

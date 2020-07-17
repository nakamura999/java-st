package method;

public class methodB {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("田中");
		hello("高橋");
		hello("佐々木");
		System.out.println("メソッドの呼び出しが終わりました。");
	}
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは！ ");
	}

}

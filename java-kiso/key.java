public class key {
	public static void main(String[] args) {
		System.out.println("あなたの名前を入力してください。");
		String name = new java.util.Scanner(System.in).nextLine();
		// new java.util.Scanner(System.in).nextLine() キーボードから一行の文字列の入力を受け付ける
		System.out.println("あなたの年齢を入力してください。");
		int age = new java.util.Scanner(System.in).nextInt();
		// new java.util.Scanner(System.in).nextInt() キーボードから1つの整数の入力を受け付ける
		System.out.println("ようこそ、" + age + "歳の" + name + "さん");
	}
}

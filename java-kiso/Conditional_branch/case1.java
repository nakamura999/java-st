public class case1 {
	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		int forture = new java.util.Random().nextInt(5) + 1;
		switch (forture) {
			case 1:
			case 2:
			// fortureが1か2なら
				System.out.println("いいね ！");
				break;
			case 3:
				System.out.println("普通です。");
				break;
			case 4:
			case 5:
				System.out.println("イマイチ・・・");
		}
	}
}

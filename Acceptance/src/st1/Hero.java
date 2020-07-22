package st1;

public class Hero {
	private int hp;
	private String name;
	// getterメソッド　フィールド値を取り出すメソッド
	public String getName() {
		return this.name;
	}
	// setterメソッド　フィールドに値を代入
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断。");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎます。2文字以上で入力ください。");
		}
		if (name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎます。7文字以下に入力してください。");
		}
		this.name = name;
	}
	Sword sword;
	static int money;
	void byr() {
		System.out.println("勇者は別れを告げた");
	}
	private void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}
	void sleap() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した。");
	}
	public void attack(Matango m) {
		System.out.println(this.name + "は攻撃！");
		System.out.println("お化けきのこ" + m.suffix + "2ポイントの反撃を受けた");
		this.hp -= 2;
		if (this.hp <= 0) {
			this.die();
		}
	}
}


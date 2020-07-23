package st1;

public class SuperHero extends Hero {
	// extends 継承　Heroクラスと同じメンバの定義を省略。
	public SuperHero() {
		super();
		System.out.println("スーパー勇者が生成された！");
	}
	private boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	public void run() {
		System.out.println(this.getName() + "は撤退した！");
		// 親クラスにもrun()は定義されているが、小クラスで再度定義ができる。
	}
	public void attack(Matango m) {
		super.attack(m);
		// super 『親インスタンス』を表す予約後
		if (this.flying) {
			super.attack(m);
		}
	}
}

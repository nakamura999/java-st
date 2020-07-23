package st1;

// このクラスはnewさせない
public abstract class Character {
	String name;
	int hp;
	// 逃げる
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
	// 闘う
	public abstract void attack(Matango m); //{
//		System.out.println(this.name + "の攻撃！");
//		m.hp -= ??;
//		System.out.println("敵に？？ポイントのダメージを与えた");
//	}

}

package hello3;

public class Hero {
	String name;
	int hp;
	Sword sword;
	void attack() {
		System.out.println(this.name + "は、攻撃した！");
		System.out.println("敵に5pointのダメージを与えた！");
	}
}

package hello4;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "サトシ";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "ミナミ";
		h2.hp = 100;
		Wizard w = new Wizard();
		w.name = "シン";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
	}
}

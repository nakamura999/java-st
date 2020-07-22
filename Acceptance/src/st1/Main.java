package st1;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
//		h.setName(""); エラー
		h.setName("サトシ");
		System.out.println("勇者の名前は、" + h.getName() + "です");
		SuperHero sh = new SuperHero();
		sh.setName("風見");
		sh.run();
	}
}

package st1;

public class Main {
	public static void main(String[] args) {
		Bicycle bicycle1 = new Bicycle("ビアンキ", "緑");
		System.out.println("[自転車の情報]");
//		System.out.println("名前: " + bicycle.getName());
		bicycle1.printData();
	}

}

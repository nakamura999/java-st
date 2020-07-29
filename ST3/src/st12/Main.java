// Scanner
package st12;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("名前: ");

		String name = scanner.next();

		System.out.println("こんにちは" + name + "さん");
	}

}

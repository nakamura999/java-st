// break continue
package st10;

public class Main {
	public  static void main(String[] args) {
		System.out.println("===while文===");
		int i = 1;
		while (i < 10) {
			if (i % 5 == 0) {
				break;
			}

			System.out.println(i);
			i++;
		}

		System.out.println("==for==");
		for (int j = 1; j < 10; j++) {
			if (j % 3 == 0) {
				continue;
			}
		}

	}

}

// switch
package st6;

public class Main {
	public static void main(String[] args) {
		int number = 12;
		switch (number % 3) {
		case 0:
			System.out.println("3で割り切れます");
			break;
		case 1:
			System.out.println("3で割ると1あまります");
			break;
		case 2:
			System.out.println("3で割ると2あまります");
			break;
		}
	}

}

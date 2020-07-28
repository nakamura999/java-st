// 論理演算子 &&「かつ」　||「または」
package st3;

public class Main {
	public static void main(String[] args) {
		System.out.println(true || false);
		// true
		System.out.println(false && true);
		// false
		System.out.println(8 < 5 && 3 >= 2);
		// false
		System.out.println(8 < 5 || 3 >= 2);
		// true
		System.out.println(!(8 < 5));
		// true
	}

}

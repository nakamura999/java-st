package st7;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
		} catch (IOException e) {
			System.out.println("エラーが発生しました");
			System.exit(1);
		}
	}
}

// try {
//   本来の処理
// } catch(例外クラス　変数名) {
//   例外が発生した場合の処理
// }

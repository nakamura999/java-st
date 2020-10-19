package file;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			// Fileクラスは、java.ioパッケージのクラスで、コンピューター内のファイルやディレクトリを、オブジェクトとして扱うことができるようにするクラス
			File file = new File("/Users/masahiro/Desktop/java-st/File/filesample.txt");
			System.out.println(file.exists()); // ファイルの有無を調べる
			System.out.println(file.createNewFile()); // ファイルの生成
		} catch (IOException e) {
			System.out.println("処理に失敗しました。");
		}
	}
}

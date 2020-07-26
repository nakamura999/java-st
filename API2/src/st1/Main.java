package st1;

import java.io.FileWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		String filename = "c:¥¥test.txt";
		FileWriter fw = new FileWriter(filename);
		fw.write('そ');
		fw.write('れ');
		fw.close();
	}

}

// ファイルに書き込み

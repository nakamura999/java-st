package st8;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello");
		} catch (IOException e) {
			System.out.println("エラーです");
		} finally {
			fw.close();
		}
	}
}

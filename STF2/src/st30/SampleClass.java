package st30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class SampleClass {
	 public static void main(String[] args) throws IOException {
	        HashSet<String> map = new HashSet<String>();
	        InputStreamReader isr = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(isr);
	        String buf;

	        while (true) {
	            System.out.print("英単語を入力 : ");
	            buf = br.readLine();

	            if (buf.equals("")) {
	                System.out.println("プログラムを終了します。");
	                break;
	            }

	            String[] list= buf.split("");
	            System.out.print("使用されているアルファベット : ");
	            for(int i=0; i<list.length; i++){
	            map.add(list[i]);
	            }

	            for (String s : map) {
	                System.out.print(s + " ");
	            }
	            System.out.println();
	            System.out.println();
	    }
	}
}

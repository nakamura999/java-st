package st20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SampleClass {
    public static void main(String[] args) throws IOException{
    	ArrayList<String> al = new ArrayList<String>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

            while(true){
            	System.out.print("文字を入力 : ");
            	String buf = br.readLine();
                if (buf.equals("")) {
                	// 空白の場合
                    break;
                }
                al.add(buf);
            }

            for(int i = 0; i < al.size(); i++){
            	String s = (String)al.get(i);
                System.out.print(s + " ");
            }
     }
}

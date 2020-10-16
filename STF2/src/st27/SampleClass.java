package st27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SampleClass {
    public static void main(String[] args) throws IOException  {
    	 HashMap<String,String> map = new HashMap<String,String>();
    	 InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
    	 String english[] = { "cat" , "dog" , "bird" , "tiger" };
        //  コンソールから文字列の読み込み
    	System.out.print("英語で動物の名前を入力してください : ");
        String buf = br.readLine();

        map.put(english[0], "猫");
        map.put(english[1], "犬");
        map.put(english[2], "鳥");
        map.put(english[3], "トラ");
        for(String s: english){
        	if (s.equals(buf)) {
        		System.out.println("「" + map.get(s)+"」です。");
        	} else if (!(english[0].equals(buf)) && !(english[1].equals(buf)) && !( english[2].equals(buf)) && !(english[3].equals(buf))) {
        		System.out.println("対応するデータがありません。");
        		break;
        	}
        }
    }
}

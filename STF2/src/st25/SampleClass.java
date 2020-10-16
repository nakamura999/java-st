package st25;

import java.util.HashSet;

public class SampleClass {
    public static void main(String[] args) {
    	// HashSetは、重複なくデータを格納できるコレクション。追加される要素の中に、同じものが複数含まれていても、一つとみなします
        HashSet<String> hs = new HashSet<String>();
        //  ハッシュセットにデータを追加
        hs.add("山田太郎");
        hs.add("山田太郎");
        hs.add("太田美代子");
        hs.add("斉藤五郎");
        hs.add("斉藤五郎");

        for(String s:hs){
            System.out.println(s);
        }
    }
}

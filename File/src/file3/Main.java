package file3;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("/Users/masahiro/Desktop/java-st/File/test/File1.txt");
          //ファイルのオープン
            for(int i = 1; i <= 5; i++){
                fw.write(i + "行目\r\n");
            }
            fw.close();
          //ファイルのクローズ
        }catch(IOException e){
            System.out.println("書き込みに失敗しました。");
        }
    }
}

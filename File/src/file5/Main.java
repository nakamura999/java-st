package file5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        FileWriter fw = null;
        FileReader fr = null;                   //finallyで使うのでここで宣言
        try{
            String fileName = "/Users/masahiro/Desktop/java-st/File/test/File2.txt";
            fw = new FileWriter(fileName);  //ストリームのオープン
            fr = new FileReader(fileName);  //ストリームのオープン
            fw.write("あいうえお\r\n");
            fw.write("かきくけこ\r\n");
            fw.flush();                         //ここでフラッシュ
            fw.write("さしすせそ\r\n");
            int c;                              //char型なのでintに代入
            while((c = fr.read()) != -1){       //文字が無かったら-1が返る
                System.out.print((char)c);  //int型をchar型に型変換
            }
        }catch(FileNotFoundException e){
            System.out.println("ファイルが見つかりません。");
        }catch(IOException ee){
            System.out.println("ファイルエラーです。");
        }finally{
            try{
                if(fw != null){
                    fw.close();        // ファイルクローズ
                }
                if(fr != null){
                    fr.close();         // ファイルクローズ
                }
            }catch(IOException e){

            }               //例外処理
        }
    }
}

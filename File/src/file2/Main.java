package file2;

import java.io.File;

public class Main {
    public static void main(String[] args){
        File fi = new File("/Users/masahiro/Desktop/java-st/File/test");
        File[] fiList = fi.listFiles();
        System.out.println("指定したディレクトリは、" + fi.getAbsolutePath() + "です。");
        // getAbsolutePath()メソッドでは、ファイルクラスのインスタンスの絶対パスを得る
        for(int i = 0; i < fiList.length; i++){
            if(fiList[i].isFile() == true){
                System.out.println("ファイル名は、" + fiList[i].getName() + "です。");
            }else if(fiList[i].isDirectory() == true){
                System.out.println("ディレクトリ名は、" + fiList[i].getName() + "です。");
            }
        }
    }

}

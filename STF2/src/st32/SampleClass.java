package st32;

public class SampleClass {
    public static void main(String[] args) {
    	try {
    		int a[] = { 0, 1, 2};
            //  配列の内容を表示
            for(int i = 0; i < 4; i++){
                System.out.println("a[" + i +"]=" + a[i]);
            }
    	}catch(IndexOutOfBoundsException e){
    		// 配列のインデックスなどのインデックスについて、有効な範囲を超えてアクセスした場合に発生する例外。
    		System.out.println("配列の範囲を超えています。");
    	}finally{
    		System.out.println("");
    	}
    }
}

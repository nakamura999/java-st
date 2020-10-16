package st22;

import java.util.ArrayList;
import java.util.Random;

public class SampleClass {
    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        while(true){
            int num = rand.nextInt(11);
            System.out.println("0～10の値を出力:" + num);
            if (num == 0) {
            	for(int i = 0; i < numbers.size(); i++) {
            		if (numbers.get(i) == 2) {
            			// 値が２の場合削除
            			numbers.remove(i);
            		}
            		System.out.print(numbers.get(i) + " ");
            	}
                break;
            }
            numbers.add(num);// リストに追加する
        }
    }
}

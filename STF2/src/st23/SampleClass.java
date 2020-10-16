package st23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SampleClass {
    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        while(true){
            int num = rand.nextInt(11);
            System.out.println("0～10の値を出力:" + num);
            if (num == 0) {
                break;
            }
            numbers.add(num);// リストに追加する
            System.out.print("出力された数 : ");
            // 小さい順にソート
            Collections.sort(numbers);
            for(int i = 0; i < numbers.size(); i++) {
            	System.out.print(numbers.get(i) + " ");
            }
            System.out.println();
        }
    }
}

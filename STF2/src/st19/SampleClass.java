package st19;

import java.util.ArrayList;
import java.util.Random;

public class SampleClass {
    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        while(true){
            int num = rand.nextInt(101);
            System.out.println("0～100の値を出力:" + num);
            if (num == 0) {
                break;
            }
            numbers.add(num);// リストに追加する
        }
        String result[] = new String[10];

        for(int i = 0; i < 10; i++){
            result[i] = "";
            for(int j = 0; j < numbers.size(); j++){
            	// 10で割り、余りi
                if(numbers.get(j) % 10 == i){
                    result[i] += Integer.toString(numbers.get(j)) + " ";
                }
            }
        }
        // 結果表示
        for(int i = 0; i < 10; i++){
            System.out.printf("1の位が%d : ",i);
            System.out.println(result[i]);
        }
    }
}

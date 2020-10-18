package st29;

import java.util.HashSet;
import java.util.Random;

public class SampleClass {
	public static void main(String[] args) {
		//  HashSet 重複する値を削除して配列に追加
		HashSet<Integer> list = new HashSet<Integer>();
		Random rand = new Random();
		int[] num = new int[10];

	    System.out.print("乱数 : ");
        for(int i = 0; i < 10; i++) {
            num[i] += rand.nextInt(11);
            list.add(num[i]);
            System.out.print(num[i] + " ");
        }

        System.out.println();
        System.out.print("出現した数 : ");
        for(Integer s : list) {
            System.out.print(s + " ");
        }
   }
}

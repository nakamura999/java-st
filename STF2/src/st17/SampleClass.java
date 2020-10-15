package st17;

import java.util.ArrayList;

public class SampleClass {
    public static void main(String[] args) {
//      ArrayList al = new ArrayList();
      ArrayList<Integer> al = new ArrayList<Integer>();
      ArrayList<Integer> ah = new ArrayList<Integer>();
      ArrayList<Integer> an = new ArrayList<Integer>();
  	  for (int i =  (int) (Math.random() * 11); true; i = (int) (Math.random() * 11) ) {
    		if (i == 0) {
    			System.out.println("0〜10の値を出力 : 0");

    			System.out.print("偶数 : ");
    			for(Integer s : ah ) {
    				System.out.print(s + " ");
    			}
    			System.out.println();

    			System.out.print("奇数 : ");
    			for(Integer c : an ) {
    				System.out.print(c + " ");
    			}
    			System.out.println();

    			break;
      		}
    		if (i != 0) {
    			al.add(i);
    			if (i % 2 == 0) {
    				int h = i;
    				ah.add(h);
    			} else {
    				int n = i;
    				an.add(n);
    			}
    		}
    		System.out.println("0〜10の値を出力 : " + i);
  	  }
   }
}

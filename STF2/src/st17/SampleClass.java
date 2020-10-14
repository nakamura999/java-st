package st17;

import java.util.ArrayList;

public class SampleClass {
    public static void main(String[] args) {
//      ArrayList al = new ArrayList();
  	ArrayList<Integer> al = new ArrayList<Integer>();
  	  for (int i =  (int) (Math.random() * 11); true; i = (int) (Math.random() * 11) ) {
    		if (i == 0) {
    			System.out.println("0〜10の値を出力 : 0");
      			break;
      		}
    		al.add(i);
    		System.out.println("0〜10の値を出力 : " + i);
  	  }
  }

}

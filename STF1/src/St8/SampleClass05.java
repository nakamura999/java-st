package St8;

public class SampleClass05 {
	int[] d = new int[7];
	public SampleClass05() {
		System.out.println("配列2");
	    for (int i = 0; i < 7; i++) {
	    	// 1~10ランダム
	    	d[i] = (int) (Math.random() * 10) + 1;
	    	System.out.print("d[" + i + "]=" + d[i] + " ");
	    }
	    System.out.println("");
	}

}

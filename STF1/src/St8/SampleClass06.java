package St8;

public class SampleClass06 {
	int[] data = new int[10];
	public SampleClass06() {
		System.out.println("問題3");
	    for (int i = 0; i < data.length; i++) {
	    	// 1~10ランダム
	    	data[i] = (int) (Math.random() * 100) + 1;
	    }
	    for (int i = 0; i < data.length; i++) {
	    	System.out.print(data[i] + " ");
	    }
	    System.out.println();

	    System.out.print("奇数: ");
	    for (int i = 0; i < data.length; i++) {
	    	if (data[i] % 2 != 0) {
	    		System.out.print(data[i] + " ");
	    	}
	    }
	    System.out.println();

	    System.out.print("偶数: ");
	    for (int i = 0; i< data.length; i++) {
	    	if (data[i] % 2 == 0) {
	    		System.out.print(data[i] + " ");
	    	}
	    }
	    System.out.println();
	}

}

package St8;

public class SampleClass07 {
	int[] data = new int[10];
	public SampleClass07() {
		System.out.println("問題4");
	    for (int i = 0; i < data.length; i++) {
	    	// 1~100ランダム
	    	data[i] = (int) (Math.random() * 100) + 1;
	    }
	    for (int i = 0; i < data.length; i++) {
	    	System.out.print(data[i] + " ");
	    }
	    System.out.println();

	    System.out.print("50以上の数: ");
	    for (int i = 0; i < data.length; i++) {
	    	if (data[i] >= 50) {
	    		System.out.print(data[i] + " ");
	    	}
	    }
	    System.out.println();

	    System.out.print("50以下の数: ");
	    for (int i = 0; i< data.length; i++) {
	    	if (data[i] < 50) {
	    		System.out.print(data[i] + " ");
	    	}
	    }
	    System.out.println();
	}

}

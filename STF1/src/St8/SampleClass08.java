package St8;

public class SampleClass08 {
	int[] data = new int[10];
	public SampleClass08() {
		System.out.println("問題5");
		for (int i = 0; i < data.length; i++) {
			data[i] = (int) (Math.random() * 10) + 1;
		}
	    for (int i = 0; i < data.length; i++) {
	    	System.out.print(data[i] + " ");
	    }
	    System.out.println();

	    System.out.println("3の倍数 : ");
	    for (int i = 0; i < data.length; i++) {
	    	if (data[i] % 3 == 0) {
	    		System.out.print(data[i] + " ");
	    	}
	    }
	    System.out.println();

	    System.out.println("３の倍数以外の数 : ");
	    for (int i = 0; i < data.length; i++) {
	    	if (data[i] % 3 != 0) {
	    		System.out.print(data[i] + " ");
	    	}
	    }
	    System.out.println();
	}

}

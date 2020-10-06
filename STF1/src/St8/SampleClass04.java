package St8;

public class SampleClass04 {
	double[] d = new double[4];
	public SampleClass04() {
		System.out.println("問題2");
	    d[0] = 0.2;
	    d[1] = -5.1;
	    d[2] = 8;
	    d[3] = 1.8;
	    for (int i = 0; i < 4; i++) {
	    	System.out.print("d[" + i + "]=" + d[i] + " ");
	    }
	    System.out.println();
	}
}

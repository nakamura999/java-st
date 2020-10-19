package st34;

public class SampleClass {
    public static void main(String[] args) {
            for(int i = 0; i < 3 ; i++){
            	for(int j = 0; j < 3; j++){
            		try {
            		System.out.print(i + "/ " + j + " = " + calc(i,j) + " ");
            		}catch(ArithmeticException e){
            			System.out.println();
                        System.out.println("0で割り算はできません。");
                    }finally{
                    	System.out.print("");
                    }
            	}
            }
    }
   	private static int calc(int i,int j) throws ArithmeticException{
	     return i / j;
	}

}

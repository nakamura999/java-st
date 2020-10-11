package St3;

public class Problem {
    public Problem(){
        System.out.println("コンストラクタ");
    }
	public static void square(int a, int b) {
		if (a == 0 || b == 0){
			System.out.println();
		} else if (a == 1 && b == 1) {
			System.out.println("*");
		} else if (a == 2 && b == 1) {
			System.out.println("*");
			System.out.println("*");
		} else if (a == 3 && b == 1) {
			System.out.println("*");
			System.out.println("*");
			System.out.println("*");
		} else if (a == 4 && b == 1) {
			System.out.println("*");
			System.out.println("*");
			System.out.println("*");
			System.out.println("*");
		} else if (a == 5 && b == 1) {
			System.out.println("*");
			System.out.println("*");
			System.out.println("*");
			System.out.println("*");
			System.out.println("*");
		} else if (a == 1 && b == 2) {
			System.out.println("**");
		} else if (a == 1 && b == 3) {
			System.out.println("***");
		} else if (a == 1 && b == 4) {
			System.out.println("****");
		} else if (a == 1 && b == 5) {
			System.out.println("*****");
		} else if (a == 2 && b == 2) {
			System.out.println("**");
			System.out.println("**");
		} else if (a == 2 && b == 3) {
			System.out.println("***");
			System.out.println("***");
		} else if (a == 2 && b == 4) {
			System.out.println("****");
			System.out.println("****");
		} else if (a == 2 && b == 5) {
			System.out.println("*****");
			System.out.println("*****");
		} else if (a == 3 && b == 2) {
			System.out.println("**");
			System.out.println("**");
			System.out.println("**");
		} else if (a == 3 && b == 3) {
			System.out.println("***");
			System.out.println("***");
			System.out.println("***");
		} else if (a == 3 && b == 4) {
			System.out.println("****");
			System.out.println("****");
			System.out.println("****");
		} else if (a == 3 && b == 5) {
			System.out.println("*****");
			System.out.println("*****");
			System.out.println("*****");
		} else if (a == 4 && b == 2) {
			System.out.println("**");
			System.out.println("**");
			System.out.println("**");
			System.out.println("**");
		} else if (a == 4 && b == 3) {
			System.out.println("***");
			System.out.println("***");
			System.out.println("***");
			System.out.println("***");
		} else if (a == 4 && b == 4) {
			System.out.println("***");
			System.out.println("***");
			System.out.println("***");
			System.out.println("***");
		} else if (a == 4 && b == 5) {
			System.out.println("*****");
			System.out.println("*****");
			System.out.println("*****");
			System.out.println("*****");
		} else if (a == 5 && b == 2) {
			System.out.println("**");
			System.out.println("**");
			System.out.println("**");
			System.out.println("**");
			System.out.println("**");
		} else if (a == 5 && b == 3) {
			System.out.println("***");
			System.out.println("***");
			System.out.println("***");
			System.out.println("***");
			System.out.println("***");
		} else if (a == 5 && b == 4) {
			System.out.println("****");
			System.out.println("****");
			System.out.println("****");
			System.out.println("****");
			System.out.println("****");
		} else if (a == 5 && b == 5) {
			System.out.println("*****");
			System.out.println("*****");
			System.out.println("*****");
			System.out.println("*****");
			System.out.println("*****");
		}

	}
	public static void main(String[] args) {
		System.out.println("問題3");
		int a = (int) (Math.random() * 5) + 1;
		int b = (int) (Math.random() * 5) + 1;
		System.out.println("縦 : " + a);
		System.out.println("横 : " + b);
		Problem.square(a, b);
	}
}

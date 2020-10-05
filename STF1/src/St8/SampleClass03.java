package St8;

public class SampleClass03 {
	private int number = 0;

	private String str = "";

	public SampleClass03(String str) {
		this.str = str;
	}

	// number変数のセッター
	public void setNumber(int number) {
		this.number = number;
	}

	// number変数のゲッター
	public int getNumber() {
		return this.number;
	}

	// str変数のゲッター
	public String getStr() {
		return this.str;
	}
}

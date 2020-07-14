public class js {
    public static void main (String[] args) {
        int a;
        int b;
        int c;
        int x = 30;
        int z = 20;
        double d = 8.5 / 2;
        String msg = "私の年齢は" + 30;
        // 30(int)が"30"(String)に変換されて連結
        int r = new java.util.Random().nextInt(30);
        // new java.util.Random().nextInt(30) 29までの数字がランダムで表示される
        a = 100;
        b = a + 50;
        c = a++;
        int m = Math.max(x, z);
        // Math.max() 一番大きい数字を判定
        String age = "32";
        int n = Integer.parseInt(age);
        // Integer.parseInt() 文字列を数字に変換
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(msg);
        System.out.println(x + "と" + z + "で一番大きい数字は" + m + "です。");
        System.out.println(n);
        System.out.println(r);
    }

}
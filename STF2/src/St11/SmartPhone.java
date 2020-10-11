package St11;

public class SmartPhone extends Computer {
    public SmartPhone(){
        super("スマートフォン");
    }
    //  入力処理
    public void input(){
        System.out.println("タッチパネルディスプレイをタップして操作");
    }
    //  出力処理
    public void output(){
        System.out.println("タッチパネルディスプレイに出力");
    }

    public void communication(){
        System.out.println("インターネットと電話回線で通信");
    }
}

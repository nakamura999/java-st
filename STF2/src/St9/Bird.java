package St9;

// 抽象クラス
public abstract class Bird {
    private String name;
    Bird(String name){
        this.name = name;
    }
    //  名前の取得
    public String getName(){ return name; }
    //  鳴く（抽象メソッド）
    abstract void sing();
}

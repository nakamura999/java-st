package St10;

public abstract class AirPlane {
    private String type;
    AirPlane(String type){
        this.type = type;
    }
    //  名前の取得
    public String getName(){ return type; }
    //  鳴く（抽象メソッド）
    abstract void fly();
}

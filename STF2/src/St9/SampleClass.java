package St9;

public class SampleClass {
	public static void main(String args[]){
        Crow2 c = new Crow2();
        Sparrow2 s = new Sparrow2();
        //  カラスがなく
        System.out.print(c.getName()+" : ");
        c.sing();
        //  雀がなく
        System.out.print(s.getName()+" : ");
        s.sing();
    }
}

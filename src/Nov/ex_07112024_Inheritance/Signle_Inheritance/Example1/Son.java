package Nov.ex_07112024_Inheritance.Signle_Inheritance.Example1;

public class Son extends Father{
    int cash=5000;
    String car="Verna";

    void fit(){
        System.out.println("Workout daily");

        Father f= new Father();
        System.out.println(f.cash);
        System.out.println(f.car);
        f.angry();
    }
}

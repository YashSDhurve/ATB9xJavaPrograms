package Nov.ex_12112024_Abstraction;

public class Lab159 {
    public static void main(String[] args) {

        Verna v = new Verna();
        v.Drive();

        Tesla t = new Tesla();
        t.Drive();

    }
}

class Verna extends Engine{

    void Drive(){
        startEngine();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("Starting the Engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the Engine");

    }
}

abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();
}

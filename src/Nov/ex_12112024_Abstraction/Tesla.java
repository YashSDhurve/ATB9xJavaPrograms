package Nov.ex_12112024_Abstraction;

public class Tesla extends Engine{
    @Override
    void startEngine() {
        System.out.println("Starting the Electric Engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the Electric Engine");
    }

    void Drive(){
        startEngine();
        stopEngine();
    }
}

package Nov.ex_12112024_Abstraction;

public class Lab158 {
    public static void main(String[] args) {
        Child c = new Child();
        c.loan50k();
        c.loan25k();
    }
}

 abstract class Father{
   abstract void loan50k();

    public void loan25k(){
        System.out.println("Took another 25k loan");
    }
}

class Child extends Father{

    @Override
    void loan50k() {
        System.out.println("Given 50k");
    }
}
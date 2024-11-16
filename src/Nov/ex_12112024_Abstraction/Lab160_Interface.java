package Nov.ex_12112024_Abstraction;

public class Lab160_Interface {
    public static void main(String[] args) {

        alphabet al=new alphabet();
        al.m1();
        al.m2();

        alpha ap=new alpha();
        ap.l1();
        ap.l2();
        ap.l3();
        ap.l4();
        ap.j2();
        ap.j4();
        ap.same();



    }
}

class alphabet extends abc{

    void show(){
        m1();
        m2();
    }

    @Override
    void m1() {
        System.out.println("m1");
    }

    @Override
    void m2() {
        System.out.println("m2");
    }
}

class alpha implements xyz, wxyz{

    @Override
    public void l1() {
        System.out.println("l1");
    }

    @Override
    public void l2() {
        System.out.println("l2");
    }

    @Override
    public void l3() {
        System.out.println("l3");
    }

    @Override
    public void l4() {
        System.out.println("l4");
    }

    @Override
    public void same() {
        System.out.println("same");
    }
}



abstract class abc{
    abstract void m1();
    abstract void m2();

    void k1(){
        System.out.println("Complete function/method");
    }
}

interface xyz{
    void l1(); //by default abstract method in interface
    void l2();
    void same();

//    void j1(){
//
//    } cannot use create complete function inside interface

    // but cann be create using default and static keyword

    default void j2(){
        System.out.println("complete function using default keyword");
    }

    static void j3(){
        System.out.println("complete function using static keyword");
    }

}

interface wxyz{
    void l3(); //by default abstract method in interface
    void l4();
    void same();

//    void j1(){
//
//    } cannot use create complete function inside interface

    // but cann be create using default and static keyword

    default void j4(){
        System.out.println("wxyz function using default keyword");
    }

    static void j5(){
        System.out.println("wxyz function using static keyword");
    }

}

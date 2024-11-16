package Nov.ex_11112024_Encapsulation_part2.Car_Example;

public class Lab155_superKeyword {
    public static void main(String[] args) {
        Car c=new Car();
        c.display();
        c.message();

    }
}

class Car extends Vehicle{
    private int maxSpeed=400;


    public Car() {
        System.out.println("DC of Car/child");
        System.out.print("speed of Vehicle=");
        super.display(180);
        System.out.print("speed of car=");
        System.out.println(this.maxSpeed);
        System.out.println("speed of Vehicle="+super.maxSpeed);
        super.display(180);

    }

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void display() {
    }
}

 class Vehicle{
    public int maxSpeed=180;

     public Vehicle() {
         System.out.println("DC of vehicle/parent");
     }

     public Vehicle(int maxSpeed) {
         System.out.println("PC of vehicle/parent");
     }

     public void display(){
         System.out.println("parent");
     }

     public void display(int maxSpeed){
         System.out.println(maxSpeed);
     }

     public  void message(){
         System.out.println("Hello from Vehicle/parent");
     }

     public  void message(String msg){
         System.out.println("Hello from Vehicle/parent "+msg);
     }
 }

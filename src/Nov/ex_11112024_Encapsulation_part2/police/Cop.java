package Nov.ex_11112024_Encapsulation_part2.police;

public class Cop {
    protected int no_of_bullets;
    public String idCard;

    public Cop(int no_of_bullets) {
        this.no_of_bullets = no_of_bullets;
    }

protected void canShoot(){
    System.out.println("Yes, you can shoot");
}


}

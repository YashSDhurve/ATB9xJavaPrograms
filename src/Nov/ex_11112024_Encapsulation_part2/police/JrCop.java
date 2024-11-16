package Nov.ex_11112024_Encapsulation_part2.police;

public class JrCop {
    public static void main(String[] args) {
        Cop jrc =new Cop(5);
        System.out.println(jrc.no_of_bullets);
        jrc.canShoot();
    }
}

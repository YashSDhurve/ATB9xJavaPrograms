package Nov.ex_11112024_Encapsulation_part2.Real;

public class TestCase1 extends BaseClass{
    public TestCase1() {
        super();
        System.out.println("DC of TestCase1");
    }

    public void StartingTC(){
        openBrowser("Chrome");
        closeBrowse();
    }

    @Override
    public void setBrowser(String browser, Boolean isAuth) {
        System.out.println("Own logic");
        super.setBrowser(browser, isAuth);
    }
}

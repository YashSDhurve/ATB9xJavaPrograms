package Nov.ex_07112024_Inheritance.Signle_Inheritance.Real_Life_Example;

public class Testcase1 extends Common_baseTest {
    public Testcase1() {
        System.out.println("DC of child class");
    }

    void testcase(){
        openBrowser();
        readExcelFile();
        closeBrowser();
    }
}

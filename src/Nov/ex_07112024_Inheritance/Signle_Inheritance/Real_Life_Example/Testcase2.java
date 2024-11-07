package Nov.ex_07112024_Inheritance.Signle_Inheritance.Real_Life_Example;

public class Testcase2 extends Common_baseTest{
    public Testcase2() {
        System.out.println("DC of Testcase2");
    }

    void testcase2(){
        System.out.println("Executing Testcase2");
        openBrowser();
        readExcelFile();
        closeBrowser();
    }
}

package Nov.ex_11112024_Encapsulation_part2.Real;

public class BaseClass {
    private String browser;

    public BaseClass() {
        System.out.println("DC of BaseClass");
    }

    public BaseClass(String b) {
        System.out.println("PC of BaseClass");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, Boolean isAuth) {
        if (isAuth){
            this.browser = browser;
        }
        else
        {
            System.out.println("Not Allowed");
        }
    }

    void openBrowser(){
        System.out.println("Opening Browser");
    }

     void openBrowser(String browserName){
            System.out.println("Opening browser - "+browserName);
    }

     void closeBrowse(){
        System.out.println("Closing browser");
    }
}

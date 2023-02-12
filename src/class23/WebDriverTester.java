package class23;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver webDriver=new Safari();       //Up casting
        //FireFox fireFox=new WebDriver();      //down casting not allowed
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();

        //an Array of type parent class can hold the objects of all the child classes
        /*Chrome chrome=new Chrome();
        FireFox fireFox=new FireFox();
        Safari safari=new Safari();

        WebDriver [] browsers={chrome,fireFox,safari};*/

        WebDriver [] browsers={new Chrome(),new Safari(),new FireFox()};

        for (WebDriver browser:browsers){
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
        }

    }
}

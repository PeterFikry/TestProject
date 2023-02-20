package Project15022023;

public class WebTester {
    public static void main(String[] args) {
    ChromeDriver chromeDriver=new ChromeDriver();
    chromeDriver.open();
    chromeDriver.navigate();
    chromeDriver.getTitle();
    chromeDriver.close();

    FirefoxDriver firefoxDriver=new FirefoxDriver();
    firefoxDriver.open();
    firefoxDriver.navigate();
    firefoxDriver.getTitle();
    firefoxDriver.close();

    SafariDriver safariDriver=new SafariDriver();
    safariDriver.open();
    safariDriver.navigate();
    safariDriver.getTitle();
    safariDriver.close();
    }
}

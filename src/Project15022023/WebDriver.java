package Project15022023;

public interface WebDriver {
    /*
    Provide Implementation for the diagram below.
    Then create a test class in which you need to create Objects of
    ChromeDriver, FirefoxDriver and SafariDriver classes and
    see which methods available to them.
     */

    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver {

    void navigate();
}

class ChromeDriver implements RemoteWebDriver {
    @Override
    public void navigate() {
        System.out.println("Navigate by using Chrome");
    }

    @Override
    public void open() {
        System.out.println("Chrome Open");
    }

    @Override
    public void close() {
        System.out.println("Chrome Close");
    }

    @Override
    public String getTitle() {
        return "Chrome Title";
    }
}

class FirefoxDriver implements RemoteWebDriver {
    @Override
    public void navigate() {
        System.out.println("Navigate by using Firefox");
    }

    @Override
    public void open() {
        System.out.println("Firefox Open");
    }

    @Override
    public void close() {
        System.out.println("Firefox Close");
    }

    @Override
    public String getTitle() {
        return "Firefox Title";
    }
}

class SafariDriver implements RemoteWebDriver {
    @Override
    public void navigate() {
        System.out.println("Navigate by using SafariDriver");
    }

    @Override
    public void open() {
        System.out.println("Safari Open");
    }

    @Override
    public void close() {
        System.out.println("Safari Close");
    }

    @Override
    public String getTitle() {
        return "Safari Title";
    }
}
interface TakesScreenshot extends RemoteWebDriver{
    void getScreenshot();
}
package HomeWorkFeb142023;

/*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
public interface WebDriver {
    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();
}
    class ChromeDriver implements WebDriver {
        @Override
        public void openBrowser() {
            System.out.println("Open Chrome Browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Close Chrome Browser");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Maximize Chrome Browser");
        }

        @Override
        public void findElement() {
            System.out.println("Chrome find element");
        }
    }
    class FirFoxDriver implements WebDriver {
        @Override
        public void openBrowser() {
            System.out.println("Open fireFox Browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Close fireFox Browser");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Maximize fireFox Browser");
        }

        @Override
        public void findElement() {
            System.out.println("fireFox find element");
    }
}

class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] webDrivers = {new ChromeDriver(), new FirFoxDriver()};
        for (WebDriver w : webDrivers) {
            w.openBrowser();
            w.closeBrowser();
            w.maximizeWindow();
            w.findElement();
        }
    }
}
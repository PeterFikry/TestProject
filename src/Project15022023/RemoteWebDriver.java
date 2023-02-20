package Project15022023;

public interface RemoteWebDriver extends WebDriver {

    void navigate();
}

class ChromeDriver implements RemoteWebDriver {
    @Override
    public void navigate() {

    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }
}

class FirefoxDriver implements RemoteWebDriver {
    @Override
    public void navigate() {

    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }
}

class SafariDriver implements RemoteWebDriver {
    @Override
    public void navigate() {

    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }
}
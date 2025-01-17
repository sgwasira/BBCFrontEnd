package Steps;

import Utils.BrowserFactory;

public class Hooks {
    BrowserFactory browserFactory = new BrowserFactory();
    public void tearDown() {
        BrowserFactory.tearDown();
    }
}

package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import webdriverpool.WebdriverInitializer;

public class WebdriverHook {

  @Before
  public void initialize() {
    WebdriverInitializer.initialize();
  }

  @After
  public void quitBrowser(Scenario scenario) { WebdriverInitializer.quit(); }
}

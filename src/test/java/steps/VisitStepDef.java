package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.VisitPage;
import webdriverpool.WebdriverInitializer;

public class VisitStepDef {

  VisitPage visitPage = new VisitPage(WebdriverInitializer.driver);

  @Given("User go to {string}")
  public void userGoToDemoqa(String url) {
    visitPage.openPage(url);
  }
}

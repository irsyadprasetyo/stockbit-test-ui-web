package steps;

import static locator.DemoBookQALocator.SELECT_MENU_CONTAINER;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.stream.IntStream;
import org.junit.Assert;
import pages.SelectMenuPage;
import webdriverpool.WebdriverInitializer;

public class SelectMenuStepDef {

  SelectMenuPage selectMenu = new SelectMenuPage(WebdriverInitializer.driver);

  @When("User in Select Menu page")
  public void userInSelectMenuPage() {
    Assert.assertTrue("not directed to select menu page!",
        selectMenu.isOnSelectMenuPage());
  }

  @And("User choose select value {string}")
  public void userChooseSelectValue(String value) {
    selectMenu.selectValue(value);

  }

  @And("User choose select one {string}")
  public void userChooseSelectOne(String value) {
    selectMenu.selectOne(value);
  }

  @And("User choose old style select menu {string}")
  public void userChooseOldStyleSelectMenu(String value) {
    selectMenu.oldStyleSelectMenu(value);
  }

  @And("User choose multi select drop down {string}")
  public void userChooseMultiSelectDropDown(String value) {
    selectMenu.clickDropdownMultipleSelect();
    if (value.equalsIgnoreCase("all color")) {
      IntStream.range(0, selectMenu.getLengthMultiSelect()).forEach(i -> {
        selectMenu.pickFirstArrayMultiSelect();
      });
    } else {
      selectMenu.pickMultiselectByText(value);
    }
  }

  @Then("User success input all select menu")
  public void userSuccessInputAllSelect() {
    Assert.assertTrue(Boolean.TRUE);
  }
}

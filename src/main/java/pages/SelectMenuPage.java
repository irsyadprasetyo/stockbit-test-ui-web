package pages;

import static locator.DemoBookQALocator.BOX_MULTI_SELECT;
import static locator.DemoBookQALocator.BUTTON_FIRST_RESULT;
import static locator.DemoBookQALocator.DROPDOWN_BUTTON_SELECT_VALUE;
import static locator.DemoBookQALocator.DROPDOWN_SELECT_OLD_DROPDOWN;
import static locator.DemoBookQALocator.DROPDOWN_SELECT_VALUE;
import static locator.DemoBookQALocator.HEADER_SELECT_MENU;
import static locator.DemoBookQALocator.INPUT_SELECT_ONE;
import static locator.DemoBookQALocator.INPUT_TEXT_SEARCH_BOOK;
import static locator.DemoBookQALocator.SELECT_MENU_CONTAINER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMenuPage {

  ChromeDriver driver;

  private static WebElement element;

  public SelectMenuPage(ChromeDriver driver) { this.driver = driver; }

  public Boolean isOnSelectMenuPage() {
    return driver.findElement(HEADER_SELECT_MENU).isDisplayed();
  }

  public void selectValue(String value) {
    driver.findElement(DROPDOWN_BUTTON_SELECT_VALUE).click();
    driver.findElement(By.xpath(String.format(DROPDOWN_SELECT_VALUE, value))).click();
  }
  
  public void selectOne(String value) {
    driver.findElement(INPUT_SELECT_ONE).sendKeys(value);
    driver.findElement(BUTTON_FIRST_RESULT).click();
  }

  public void oldStyleSelectMenu(String value) {
    Select dropdown = new Select(driver.findElement(DROPDOWN_SELECT_OLD_DROPDOWN));
    dropdown.selectByVisibleText(value);
  }

  public Integer getLengthMultiSelect() {
    return driver.findElements(By.xpath(BOX_MULTI_SELECT)).size();
  }

  public void clickDropdownMultipleSelect() {
    driver.findElement(SELECT_MENU_CONTAINER).click();
  }

  public void pickFirstArrayMultiSelect() {
    driver.findElements(By.xpath(BOX_MULTI_SELECT))
        .stream().findFirst().get().click();
  }

  public void pickMultiselectByText(String value) {
    driver.findElement(By.xpath(String.format(
        BOX_MULTI_SELECT + "[contains(text(), %s)]", value))).click();
  }
}

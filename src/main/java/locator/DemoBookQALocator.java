package locator;

import org.openqa.selenium.By;

public interface DemoBookQALocator {

  // Book Store Page
  // LABEL & BUTTON
  By LABEL_BOOK_STORE = By.cssSelector("div.pattern-backgound.playgound-header > div");
  By INPUT_TEXT_SEARCH_BOOK = By.xpath("//*[@id='searchBox']");

  // DETAIL BOOK
  By LABEL_DETAIL_TITLE = By.xpath("//*[@id='title-label']/../../div[2]/label");
  By LABEL_DETAIL_AUTHOR = By.xpath("//*[@id='author-label']/../../div[2]/label");
  By LABEL_DETAIL_PUBLISHER = By.xpath("//*[@id='publisher-label']/../../div[2]/label");

  // STRING FORMAT
  String BUTTON_SPAN_BOOK = "//*[@id='see-book-%s']";
  String LABEL_AUTHOR_BOOK = "//*[@id='see-book-%s']/../../../div[3]";
  String LABEL_PUBLISHER_BOOK = "//*[@id='see-book-%s']/../../../div[4]";

  // Select Menu Page
  By HEADER_SELECT_MENU = By.xpath("//*[@class='main-header']");
  // Dropdown Select Value
  By DROPDOWN_BUTTON_SELECT_VALUE = By.cssSelector("#withOptGroup > div > div.css-1wy0on6 > div > svg");
  String DROPDOWN_SELECT_VALUE = "//*[@class=\" css-26l3qy-menu\"]"
      + "/div/div[contains(text(), '%s')]";

  // Select One
  By INPUT_SELECT_ONE = By.id("react-select-3-input");
  By BUTTON_FIRST_RESULT = By.xpath("//*[@id='react-select-3-option-0-5']");

  // Dropdown Old Style
  By DROPDOWN_SELECT_OLD_DROPDOWN = By.xpath("//*[@id='oldSelectMenu']");

  // Dropdown Multi select
  By SELECT_MENU_CONTAINER = By.cssSelector
      ("#selectMenuContainer > div:nth-child(7) > div > div");
  String BOX_MULTI_SELECT = "//*[@class=' css-11unzgr']/div";
}

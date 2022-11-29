package pages;

import static locator.DemoBookQALocator.LABEL_DETAIL_AUTHOR;
import static locator.DemoBookQALocator.LABEL_DETAIL_PUBLISHER;
import static locator.DemoBookQALocator.LABEL_DETAIL_TITLE;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookDetailPage {

  ChromeDriver driver;

  public BookDetailPage(ChromeDriver driver) {
    this.driver = driver;
  }

  public String getTitle() {
    return driver.findElement(LABEL_DETAIL_TITLE).getText();
  }

  public String getAuthor() {
    return driver.findElement(LABEL_DETAIL_AUTHOR).getText();
  }

  public String getPublisher() {
    return driver.findElement(LABEL_DETAIL_PUBLISHER).getText();
  }
}

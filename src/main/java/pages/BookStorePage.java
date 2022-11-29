package pages;

import static locator.DemoBookQALocator.BUTTON_SPAN_BOOK;
import static locator.DemoBookQALocator.INPUT_TEXT_SEARCH_BOOK;
import static locator.DemoBookQALocator.LABEL_AUTHOR_BOOK;
import static locator.DemoBookQALocator.LABEL_BOOK_STORE;
import static locator.DemoBookQALocator.LABEL_PUBLISHER_BOOK;
import data.BookData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookStorePage {

  ChromeDriver driver;

  private static WebElement element;

  public BookStorePage(ChromeDriver driver) {
    this.driver = driver;
  }

  public Boolean isOnBookStorePage() {
    return driver.findElement(LABEL_BOOK_STORE).isDisplayed();
  }

  public void searchBook(String book) {
    driver.findElement(INPUT_TEXT_SEARCH_BOOK).sendKeys(book);
  }

  public Boolean containText(String text) {
    return driver.getPageSource().contains(text);
  }

  public String getBookTitle(String book) {
    return driver.findElement(By.xpath(
        String.format(BUTTON_SPAN_BOOK, book))).getText();
  }

  public String getAuthor(String book) {
    return driver.findElement(By.xpath(
        String.format(LABEL_AUTHOR_BOOK, book))).getText();
  }

  public String getPublisher(String book) {
    return driver.findElement(By.xpath(
        String.format(LABEL_PUBLISHER_BOOK, book))).getText();
  }

  public void selectBook(String book) {
    driver.findElement(By.xpath(String.format(BUTTON_SPAN_BOOK, book))).click();
  }
}

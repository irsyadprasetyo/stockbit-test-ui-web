package steps;

import data.BookData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import pages.BookDetailPage;
import pages.BookStorePage;
import webdriverpool.WebdriverInitializer;

public class BookStoreStepDef {

  BookStorePage bookStore = new BookStorePage(WebdriverInitializer.driver);

  BookDetailPage bookDetail = new BookDetailPage(WebdriverInitializer.driver);

  BookData bookData = new BookData();

  @When("User in Book Store page")
  public void userInBookStorePage() {
    Assert.assertTrue("page isn't directed to Book Store page!",
        bookStore.isOnBookStorePage());
  }

  @And("User search book {string}")
  public void userSearchBookString(String book) {
    bookStore.searchBook(book);
  }

  @And("User click book {string}")
  public void userClickBookString(String book) {
    bookData.setTitle(bookStore.getBookTitle(book));
    bookData.setName(bookStore.getAuthor(book));
    bookData.setPublisher(bookStore.getPublisher(book));
    bookStore.selectBook(book);
  }

  @Then("User see {string}")
  public void userSeeString(String text) {
    Assert.assertTrue("found some book!", bookStore.containText(text));
  }

  @Then("User see data between search result and book detail is corresponding")
  public void userSeeDataIsCorrespindingWithUi() {
    // assert title, author, & publisher between search result <> book detail page
    Assert.assertThat("book title is not correct!", bookData.getTitle(),
        CoreMatchers.equalTo(bookDetail.getTitle()));
    Assert.assertThat("book author is not correct!", bookData.getAuthorName(),
        CoreMatchers.equalTo(bookDetail.getAuthor()));
    Assert.assertThat("book publisher is not correct!", bookData.getPublisher(),
        CoreMatchers.equalTo(bookDetail.getPublisher()));
  }
}

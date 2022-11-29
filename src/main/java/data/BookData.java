package data;

public class BookData {

  private String authorName;
  private String bookTitle;
  private String publisher;

  // Getter
  public String getAuthorName() {
    return authorName;
  }

  public String getPublisher() {
    return publisher;
  }

  public String getTitle() {
    return bookTitle;
  }


  // Setter
  public void setName(String author) {
    this.authorName = author;
  }

  public void setPublisher(String publish) {
    this.publisher = publish;
  }

  public void setTitle(String title) {
    this.bookTitle = title;
  }
}

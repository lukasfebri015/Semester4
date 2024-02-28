public class Books {

  // Declare private instance variables
  private String author;
  private String title;
  private double price;
  private String publisherNumber;

  // Constructor to initialize variables
  public Books(String author, String title, double price, String publisherNumber) {
    this.author = author;
    this.title = title;
    this.price = price;
    this.publisherNumber = publisherNumber;
  }

  // Getter methods for accessing private variables
  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title; 
  }

  public double getPrice() {
    return price;
  }

  public String getPublisherNumber() {
    return publisherNumber;
  }

}
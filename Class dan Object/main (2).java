public class Main {

  public static void main(String[] args) {
    
    // Create Book objects
    Books book1 = new Books("J.K. Rowling", "Harry Potter", 10.99, "A123");
    
    Books book2 = new Books("Jane Austen", "Pride and Prejudice", 5.99, "B456");

    // Calculate total price
    double totalPrice = 0;
    totalPrice += book1.getPrice();
    totalPrice += book2.getPrice();

    // Print total price
    System.out.println("Total price for books: " + totalPrice);

  }

}
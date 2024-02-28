// Class App
public class App {

  public static void main(String[] args) {
    
    // Membuat objek Persegi
    Persegi persegi = new Persegi(4);
    
    // Mencetak nilai properti dan memanggil method
    System.out.println("Nilai sisi: " + persegi.getSisi());
    System.out.println("Luas persegi: " + persegi.getLuas()); 
    System.out.println("Keliling persegi: " + persegi.getKeliling());
    
  }

}
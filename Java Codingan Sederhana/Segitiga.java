import java.util.Scanner;

public class Segitiga {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan alas segitiga: ");
    double alas = input.nextDouble();

    System.out.print("Masukkan tinggi segitiga: ");
    double tinggi = input.nextDouble();

    System.out.print("Masukkan sisi A segitiga: ");
    double sisiA = input.nextDouble();

    System.out.print("Masukkan sisi B segitiga: ");
    double sisiB = input.nextDouble();

    System.out.print("Masukkan sisi C segitiga: ");
    double sisiC = input.nextDouble();

    double luas = alas * tinggi / 2;

    double keliling = sisiA + sisiB + sisiC;

    System.out.println("Luas segitiga: " + luas);
    System.out.println("Keliling segitiga: " + keliling);

  }

}
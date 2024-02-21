import java.util.Scanner;

public class KonversiSuhu {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan suhu dalam Reamur: ");
    float suhuReamur = input.nextFloat();

    float suhuCelcius = (suhuReamur / 0.8f);
    
    float suhuFahrenheit = (suhuReamur * 2.25f) + 32;
    
    float suhuKelvin = (suhuReamur / 0.8f) + 273.15f;

    // cetak hasil konversi
    System.out.println(suhuReamur + " derajat Reamur = " + suhuCelcius + " derajat Celcius");
    System.out.println(suhuReamur + " derajat Reamur = " + suhuFahrenheit + " derajat Fahrenheit");
    System.out.println(suhuReamur + " derajat Reamur = " + suhuKelvin + " derajat Kelvin");

    }

}
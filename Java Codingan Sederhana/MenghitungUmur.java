import java.time.LocalDate;
import java.time.Period;

public class MenghitungUmur {

  public static void main(String[] args) {
  
    LocalDate tanggalLahir = LocalDate.of(2004, 2, 15);
    
    LocalDate hariIni = LocalDate.now();

    Period periode = Period.between(tanggalLahir, hariIni);

    int tahun = periode.getYears();
    int bulan = periode.getMonths();
    int hari = periode.getDays();

    System.out.println("Umur: " + tahun + " tahun " + bulan + " bulan " + hari + " hari");

  }

}
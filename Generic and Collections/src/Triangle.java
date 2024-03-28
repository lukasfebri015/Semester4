public class Triangle {
    public void calculateLuas(Object alas, Object tinggi) {
        double luas = 0.5 * Double.parseDouble(alas.toString()) * Double.parseDouble(tinggi.toString());
        System.out.println("Luas Segitiga: " + luas);
    }

    public static <T, U> double hitunganKeliling(T alas, U tinggi) {
        double sisiMiring = Math.sqrt(Math.pow(Double.parseDouble(alas.toString()), 2) + Math.pow(Double.parseDouble(tinggi.toString()), 2));
        double keliling = Double.parseDouble(alas.toString()) + Double.parseDouble(tinggi.toString()) + sisiMiring;

        return keliling;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa<String, Integer> mahasiswa = new Mahasiswa<String, Integer>("Arul", "Sukabumi", 12345);
        mahasiswa.getInfo();

        System.out.println();

        Libmath<Integer, Double> math1 = new Libmath<Integer, Double>(12, 12.0);
        System.out.println("Hasil penjumlahan: " + math1.add());

        Libmath<Double, Double> math2 = new Libmath<Double, Double>(12.0, 4.0);
        System.out.println("Hasil Pengurangan: " + math2.min());

        System.out.println();

        Triangle.calculateLuas(10, 10);
        System.out.println(Triangle.hitunganKeliling(5 ,10));
        System.out.println();

        Iteration.iterable();
        Iteration.iterator();
        Collections.addCollection();
        Collections.removeCollection();
        Collections.checkCollection();
        Lists.list();
        Sets.hashSet();
        Sets.LinkedHashSet();
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa<String, Double> mhs = new Mahasiswa<>("Dean Satria Marpaung", "Cibatu", 123456.0);
        mhs.print();
        
        Libmath<Integer, Double> math = new Libmath<>(10, 20.0);
        System.out.println("Hasil penjualan: " + math.add());

        Libmath<Integer, Double> math2 = new Libmath<>(10, 20.0);
        System.out.println("Hasil penjualan: " + math2.add());

        Triangle t = new Triangle();
        t.calculateLuas(10, 20);
        System.out.println(Triangle.hitunganKeliling(10, 20));
    }
}

class Libmath<A extends Number, B extends Number> {
    private A angka1;
    private B angka2;

    public Libmath(A angka1, B angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public double add() {
        return angka1.doubleValue() + angka2.doubleValue();
    }
}

class Mahasiswa<T, U> {
    private T name;
    private T alamat;
    private U phone;

    public Mahasiswa(T name, T alamat, U phone) {
        this.name = name;
        this.alamat = alamat;
        this.phone = phone;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + alamat);
        System.out.println("Phone: " + phone);
    }
}
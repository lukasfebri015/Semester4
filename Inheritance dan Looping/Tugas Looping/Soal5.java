public class Soal5 {
    public static void main(String[] args) {
        int base = 99;
        int start = 20;
        int loop = 5;

        for (int i = start; i < start + loop; i++) {
            System.out.println(base + " x " + i + " = " + (base * i));
        }
    }
}
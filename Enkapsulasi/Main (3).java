public class Main {
    public static void main(String[] args) {
        RightTriangle ABC = new RightTriangle("ABC", 3.0, 4.0);
        RightTriangle BCD = new RightTriangle("BCD", 3.0, 4.0);
        RightTriangle CDE = new RightTriangle(3.0, 4.0, 5.0);

        ABC.getInfo();
        BCD.getInfo();
        CDE.getInfo();
    }
}
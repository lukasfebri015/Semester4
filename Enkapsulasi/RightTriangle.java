class RightTriangle extends Triangle {
    public RightTriangle(String name, double side1, double side2) {
        super(name, side1, side2, Math.sqrt(side1 * side1 + side2 * side2));
    }

    public RightTriangle(double side1, double side2, double hypotenuse) {
        super(null, side1, side2, hypotenuse);
    }
}
package Atividade;

public class hexagono extends Shape {
    private double side;

    public hexagono(double side) {
        super("Hexagon");
        this.side = side;
    }

    @Override
    public double area() {
        return (3 * Math.sqrt(3) * side * side) / 2;
    }

    @Override
    public double perimeter() {
        return 6 * side;
    }
}
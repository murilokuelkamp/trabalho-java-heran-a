package Atividade;

public class pentagono extends Shape {
    private double side;

    public pentagono(double side) {
        super("Pentagon");
        this.side = side;
    }

    @Override
    public double area() {
        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * side * side;
    }

    @Override
    public double perimeter() {
        return 5 * side;
    }
}
package Atividade;

public class losango extends Shape {
    private double diagonal1;
    private double diagonal2;

    public losango(double diagonal1, double diagonal2) {
        super("Rhombus");
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double area() {
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public double perimeter() {
        return 4 * Math.sqrt((diagonal1 / 2) * (diagonal1 / 2) + (diagonal2 / 2) * (diagonal2 / 2));
    }
}
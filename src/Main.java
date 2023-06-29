import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();
        Shape noShape = new NoShape();
        ShapesPrinter printer = new ShapesPrinter();
        List<Shape> shapes = List.of(circle,square,cube,rectangle,noShape);
        int sum = areaCalculator.sum(shapes);
        System.out.println(printer.json(sum));
        System.out.println(printer.csv(sum));
    }
}

import java.util.List;

public class ShapesPrinter {

    private AreaCalculator areaCalculator= new AreaCalculator();
    
    public String json(<List> shapes){
        return "{shapesSum: %s}".formatted(areaCalculator.sum(shapes));
    }
    
    public String csv(<List> shapes){
        return "{shapes_sum,%s}".formatted(areaCalculator.sum(shapes));
    }
}

import java.util.List;

public class AreaCalculator {
    
    public int sum(List<Object> shapes){
        int sum=0;
        for(int i=0;i<shapes.size();i++){
            Object Shape = shapes.get(i);
            if(Shape instanceof Square){
                sum+=Math.pow(((Square) shape).getLength(),2);
            }
            if(shape instanceof Circle){
                sum+=Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            }
        }
    }
}

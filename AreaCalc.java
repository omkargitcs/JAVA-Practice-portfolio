class AreaCalc{
    int area(int side){
        return side*side;
    }
    
    int area(int legth,int breath){
        return length*breath;
    }
public class AreaCalculate{
    public Static void main(String args[]){
        AreaCalc obj = new AreaCalc();
        System.out.print("Square area :"+obj.area(45));
        System.out.print("rectangle area :"+obj.area(45,76));
        
    }
}
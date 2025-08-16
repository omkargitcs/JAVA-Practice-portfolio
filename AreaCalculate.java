public class AreaCalculate{
    int area(int side){
        return side*side;
    }
    
    int area(int length,int breath){
        return length*breath;
    }

    public static void main(String args[]){
        AreaCalculate obj = new AreaCalculate();
        System.out.print("Square area :"+obj.area(45));
        System.out.print("rectangle area :"+obj.area(45,76));
        
    }
}

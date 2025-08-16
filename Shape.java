public abstract class shape{
	public abstract double calArea();
}
public class Triangle extends Shape{
		private double A;
		private double B;
		private double C;
		
		public Triangle(double A,double B,double C){
			this.A=A;
			this.B=B;
			this.C=C;
			}
			public double calArea(){
				double s = (A+B+C)/2;
				return Math.sqrt(s*(s-A)*(s-B)*(s-C));
			}
	}
	public class Rectangle extends Shape{
		private double length;
		private double width;
		
		public Rectangle(double lenght,double width){
			this.length = length;
			this.width = width;
		}
		public double calArea(){
			return length*width;
		}
		public boolean isSquare(){
			return length==width;
		}
	}
	public class Square extends Rectangle{
		public Square(double side){
			super(side,side);
		}
		public double calArea(){
			return super.calArea();
		}
	}
	
	public class ShapeMain{
		public static void main(String[] args){
			Shape shapeRef;
			shapeRef = new Triangle(5.0,6.0,7.0);
			System.out.println("area of triangle is : " + shapeRef.calArea());
			Rectangle rect = new Rectangle(4.0, 4.0);
			if (rect.isSquare()) {
				shapeRef = new Square(rect.length); // 7. Use Square's calArea
				System.out.println("Area of Square (from Rectangle): " + shapeRef.calArea());
			}
			else {
                shapeRef = rect;
                System.out.println("Area of Rectangle: " + shapeRef.calArea());
        }
		shapeRef = newSquare(5.0);
		System.out.println("Area ofsqauare: " + shapeRef.calArea());
		

		}
		}
	}
}
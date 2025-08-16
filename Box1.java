class Box {
	int length,width;
	Box(){
		length = width = 0;
	}
	
	Box(int l,int w){
		length = l;
		width = w;
	}
	
	int area(){
		return length * width;
		
	}
}

public class Box1{
	public static void main(String[]args){
		Box box1 = new Box();
		System.out.println("area of box1 (default):" + box1.area());
		
		Box box2 = new Box(5,4);
		System.out.println("area of box 2(5 x 4):" + box2.area());
	}
}
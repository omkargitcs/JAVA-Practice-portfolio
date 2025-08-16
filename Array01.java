public class Array01{
	public static void main(String[] args){
		double [] numarray={23.4,56.7,78.8,12.3,45.6,-12.9};
		double sum = 0.0;
		
		for(double num :numarray){
			sum+=num;
		}
		double average=sum/numarray.length;
		System.out.println("the average is : "+average);
	}
}
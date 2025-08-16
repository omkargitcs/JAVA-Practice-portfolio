public class Array02{
	public static void main(String[]args){
		double[] numarray={23.4,-65.8,89.1,34.89,23.8,12.3,34.6,12.8,98.7};
		double largest = numarray[0];
		for(double num:numarray){
			if(largest<num)
				largest=num;
		}
		System.out.println("largest element = "+largest);
	}
}
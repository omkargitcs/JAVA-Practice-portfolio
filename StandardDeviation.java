public class StandardDeviation{
	public static void main(String[]args){
		double[] numArray={1,2,3,4,5,6,7,7,8,9,10,11};
		double SD = calculateSD(numArray);
		
		System.out.println("STANDARD DEVIATION :"+SD);
	}
	public static double calculateSD(double numArray[]){
		double sum = 0.0,standarddeviation = 0.0;
		int length = numArray.length;
		for(double num:numArray){
			sum+=num;
		}
		double mean = sum/length;
		for(double num:numArray){
			standarddeviation+=Math.pow(num-mean,2);
		}
		return Math.sqrt(standarddeviation/length);
	}
}
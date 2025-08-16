public class ElementinArray{
	public static void main(String[] args){
		int num[] = {1,2,4,5,6,7,8,9,34};
		int tofind = 34;
		boolean found = false;
		for(int n:num){
			if(n==tofind){
				found=true;
				break;
			}
		}
		if(found){
			System.out.println(tofind + "is found");
		}
		else{
			System.out.println(tofind + "is not find");
		}
	}
}
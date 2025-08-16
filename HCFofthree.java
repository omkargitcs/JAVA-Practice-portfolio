public class HCFofthree{
	static int findHCF(int a,int b){
		while(b!=0){
			int temp = b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	public static void main(String[] args){
		int num1 = 12, num2 = 18,num3= 24;
		int tempHCF = findHCF(num1,num2);
		int finalHCF = findHCF(tempHCF,num3);
		
		System.out.println("HCF OF "+num1+" ," + num2 + ",and" + num3 + "is : " + finalHCF);
		
		
	}
}
public class MultipleCatchBlocks{
	public static void main(String[] args){
		try{
			String str = null;
			System.out.println(str.length());
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException error occured");
		}catch (NullPointerException e){
			System.out.println("NULL POINTER ERROR OCCURED");
		}catch(Exception e){
			System.out.println("General exception caught");
		}
	}
}
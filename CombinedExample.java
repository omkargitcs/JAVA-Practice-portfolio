class CustomException extends Exception{
	public CustomException(String message){
		super(message);
	}
}
public class CombinedExample{
	static void validate(int marks)throws CustomException{
		if(marks<0|| marks>100){
		throw new CustomException("marks must be between 0 and 100");
		}
		System.out.println("marks are valid");
	}
	public static void main(String[] args){
		try{
			validate(120);
			
		}catch(CustomException e){
			System.out.println("caught : " + e.getMessage());
		}finally{
			System.out.println("validation complete");
		}
	}
}
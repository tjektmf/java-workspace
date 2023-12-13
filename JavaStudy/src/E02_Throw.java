import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class E02_Throw {
	
	
	/*
	 *  	# throw
	 *  
	 *  	- 내가 원하는 예외를 발생시킴, throw 하는 즉시 해당 메서드를 종료함
	 *  
	 *  	- 해당 예외를 catch하여 사용할 수 있다는 점에서 return과 다름
	 *  
	 *  
	 *  
	 *  	# throws
	 *  
	 *  	- 해당 메서드에서 발생할 수도 있는 예외를 적어두고 그 예외가 발생할 수 있음을 미리 알려줌
	 *  
	 *  	- 반드시 처리되어야 하는 예외들을 명시해줄 때 사용함
	 * 
	 * 
	 */
	
	public static void testMethod(int value) throws FileNotFoundException {
		
		if(value == 330) {
			throw new ArrayIndexOutOfBoundsException("그냥");
		} else if(value == 331) {
			throw new InputMismatchException("그냥2");
		} else if(value ==333) {
			// 특정 예외는 반드시 예외처리가 되어야 함
			throw new FileNotFoundException();
		}
		
		
	}
	
	public static void main(String[] args) {
		try {
		testMethod(333);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외처리함");
		} catch(InputMismatchException e) {
			System.out.println("예외처리2");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}

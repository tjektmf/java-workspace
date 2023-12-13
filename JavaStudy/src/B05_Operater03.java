
public class B05_Operater03 {
	
	public static void main(String[] args) {
		
		/*
		 * 	대입 연산자
		 * 	= 왼쪽의 변수에 오른쪽의 값을 넣는다
		 * 	
		 * 	복합 대입 연산자
		 * 	+= : 왼쪽의 변수에 오른쪽의 값을 더해 누적시킨다
		 * 	-= : 왼쪽의 변수에 오른쪽의 값을 빼서 누적
		 *  *= : 왼쪽의 변수에 오른쪽의 값을 곱해서 누적
		 *  /= : 왼쪽의 변수에 오른쪽의 값을 나눠서 누적
		 *  %= : 왼쪽의 변수에 오른쪽의 값을 나눈 나머지를 누적
		 *  
		 * 	단항 연산자
		 * 	++ : 해당 변수에 1을 더해 누적
		 *  -- : 해당 변수에 1을 빼서 누적
		 *  
		 *  단항 연산자의 위치에 따른 차이
		 *  변수의 뒤에 붙어 있는 경우
		 *  해당 줄의 모든 명령이 끝난 후에 값을 변화시킨다
		 *  ex) a++, a--
		 *  
		 *  변수의 앞에 붙어 있는 경우
		 *  해당 줄의 명령을 실행하기 전에 값을 먼저 변화시킨다
		 *  ex) ++a, --a
		 *  
		 *  
		 *  
		 */
		
		int num = 10;
		num = num + 2;
		num += 2; // 위와 같은 코드
		System.out.println(num);
		
		int a = 20;

		a += 5;
		System.out.println(a);
		
		a -= 10;
		System.out.println(a);
		
		a *= 3;
		System.out.println(a);
		
		a /= 10;
		System.out.println(a);

		a %= 3;
		System.out.println(a);
		
		//	boolean 타입의 복합 대입 연산자
		boolean readable = true;
		
		readable &= false; // and 연산을 한 후 누적
		System.out.println(readable);

		readable |= true; // or 연산을 한 후 누적
		System.out.println(readable);
		
		readable ^= false; // xor 연산을 한 후 누적 두개가 달라야 true
		System.out.println(readable);
		
		int count = 10;
		
		count++;
		System.out.println(count); //11
		count++;
		System.out.println(count); //12
		System.out.println(count++); //12
		System.out.println(++count); //14 이 두개 차이있음
		
		
		
		
	}

}

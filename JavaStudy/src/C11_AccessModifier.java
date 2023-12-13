
public class C11_AccessModifier extends myobj.C11_ModifierTest{
	
	
	//다른 패키지의 클래스를 그냥 불러 쓰는 경우 public만 사용가능
	//extends myobj.C11_ModifierTest 이렇게 상속받으면 protected까지 사용가능
	public C11_AccessModifier() {
		
		super.i1 = 123;
		super.i2 = 123;
	}
	
	/*
	 	# 접근 제어자 (Access Modifier)
	 	
	 	다른 클래스에서 해당 자원을 사용하려고 할 때 허용 범위를 설정
	 	
	 	같은 패키지의 다른 클래스에서 접근할 때
	 	
	 	다른 패키지의 다른 클래스에서 접근할 때
	 	
	 	# 종류
	 	
	 	- public 	: 다른 패키지의 다른 클래스에서도 해당 자원에 자유롭게 접근할 수 있다	 
	 	
	 	- protected : 다른 패키지의 다른 클래스에서 해당 자원에 접근하기 위해서는 해당 클래스의 상속을 받아야 함
	 	
	 	- default 	: 아무것도 안쓰면 이거임 다른 패키지에서는 해당 자원에 접근할 수 없음 같은 패키지는 가능
	 	
	 	- private 	: 현재 클래스 내부에서만 사용할 수 있음 최협의
	  
	 */

	public static void main(String[] args) {
		
		//같은 패키지의 C11_ModifierTest, 다른 클래스에 접근
		System.out.println("public static : " + C11_ModifierTest.si1);
		System.out.println("protected static : " + C11_ModifierTest.si2);
		System.out.println("default static : " + C11_ModifierTest.si3);
//		System.out.println("private static : " + C11_ModifierTest.si4);
		
		C11_ModifierTest.smethod1();
		C11_ModifierTest.smethod2();
		C11_ModifierTest.smethod3();
//		C11_ModifierTest.smethod4();
		
		C11_ModifierTest instance = new C11_ModifierTest();
		System.out.println("public instance field : " + instance.i1);
		System.out.println("protected instance field : " + instance.i2);
		System.out.println("default instance field : " + instance.i3);
//		System.out.println("private instance field : " + instance.i4);
		
		instance.method1();
		instance.method2();
		instance.method3();
//		instance.method4();
		
		System.out.println();
		//다른 패키지의 다른 클래스에 접근하는 경우
		//패키지 이름도 써줘야함
		myobj.C11_ModifierTest instance2 = new myobj.C11_ModifierTest();
		
		System.out.println(instance2.i1);
//		System.out.println(instance2.i2); protected 사용불가 상속받아야함
//		System.out.println(instance2.i3); default 사용불가
		
		instance2.method1();
		
	}
	
}

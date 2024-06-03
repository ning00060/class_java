package ch01;

public class MainTest2 {

	public static void main(String[] args) {

		// 재료 선언
		Plastic plastic01 = new Plastic();
		Powder powder01 = new Powder();

		// 사용하는 시점에 T대신 어떤 자료형을 사용할지 지정을 하면된다.
		GenericPrinter<Plastic> genericPrinter1 = new GenericPrinter<>();
		genericPrinter1.setMaterial(plastic01);// 메서드 의존 주입
		
		// 최상위 Object 를 활용할때와 비교
		// 형변환 할 필요가 없다( 다운 캐스팅)
		Plastic returnPlastic = genericPrinter1.getMaterial();
		System.out.println(returnPlastic);

		//컴파일 시점에 오류를 알려줘서 안정적인 코드 작업이 진행 된다.
//		Powder returnpowPowder= genericPrinter1.getMaterial(); <-- 오류 발생
		
	}

}

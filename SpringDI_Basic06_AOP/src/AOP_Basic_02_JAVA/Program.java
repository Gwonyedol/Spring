package AOP_Basic_02_JAVA;

import java.lang.reflect.Proxy;

public class Program {
	
	public static void main(String[] args) {
		Calc calc = new NewCalc();
		
		//Proxy 객체를 통해서 처리
		
		Calc cal = (Calc)Proxy.newProxyInstance(calc.getClass().getClassLoader(), //실제 클래스 메타 정보
				calc.getClass().getInterfaces(), //행위정보(인터페이스)
				new LogPrintHandler(calc)); //보조관심 >>실객체의 주소를 넘겨줘야한다
		
		
		int result = cal.MUL(5000,2000);
		System.out.println("main:"+result);
	}
	
}

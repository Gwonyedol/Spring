package AOP_Basic_01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

/*
 
 간단한 계산기 프로그램
 -주관심(업무) : 사칙연산(ADD ,MUL) -> 기능(함수)
 -보조관심(공통사항) : 연산에 걸린 시간
 -log 출력(console 출력 : 시스템에서 출력하는 것처럼 Red 색으로)

 
 */
public class Cal {
	public int Add(int x, int y) {
		Log log = LogFactory.getLog(this.getClass());
		
//		System.currentTimeMillis();
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("타이머 시작");
		
		int result = x + y; //주관심
		
		sw.stop();
		log.info("[타이머 종료]");
		log.info("[Time log] : ADD");
		log.info("[Time log] : "+sw.getTotalTimeMillis());
		
		
		return result;
	}
	
	public int Mul(int x, int y) {
		Log log = LogFactory.getLog(this.getClass());
		
//		System.currentTimeMillis();
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("타이머 시작");
		
		int result = x * y;
		
		log.info("[타이머 종료]");
		log.info("[Time log] : Mul");
		log.info("[Time log] : "+sw.getTotalTimeMillis());
		return result;
	}
}

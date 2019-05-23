import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MusicAspect {
	
  @Pointcut("execution(public * Speaker.*(..))")
  private void publicTarget() {
  }

  @Around("publicTarget()")
  public Object printSpeaker(ProceedingJoinPoint joinPoint) throws Throwable {
    System.out.println("스피커 실행");
    
    Object result = joinPoint.proceed();
    
    String className = joinPoint.getTarget().getClass().getSimpleName();
    
    if (className.equals("SpeakerPop")) {
      System.out.println("오늘의 Pop차트 1위입니다");
    } else if (className.equals("SpeakerPKop")) {
      System.out.println("오늘의 Melon차트 1위입니다.");
    } else {
      System.out.println("클래식차트 1위입니다.");
    }
    
    System.out.println("스피커 종료");
    
    return result;
  }
}

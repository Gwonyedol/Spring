import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Program {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AOPConfig.class);
    
    Speaker speaker = context.getBean("speakerpop", Speaker.class);
    speaker.musicon();
  }
}

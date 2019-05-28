package DI_Annotation_05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 ConfigContext 자바 파일로 XML 설정 파일을 대체하겠다
 ConfigContext 자바 가지고 객체의 생성과 조립(주입) : @Configuration이 붙으면 자바 설정파일이 된다 -> xml을 대체하겠다!
 
 IF] xml 문서라면....
 <bean id="user" class="DI_Annotation_05.User">
 <bean id="user2" class="DI_Annotation_05.User2">
 위 코드를 자바파일에서는 함수로 만들어서 객체를 return
 
 */

@Configuration
public class ConfigContext {
	
	@Bean//객체생성을 처리할 수 있는 Annotation ( 꼭 붙여줘야한다 중요쓰..! )
	public User user() { //함수 이름 id ==  <bean id="user" class="DI_Annotation_05.User">
		return new User();
	}
	@Bean
	public User2 user2() {
		return new User2();
	}
	
	
}

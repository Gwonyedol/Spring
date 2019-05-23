

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AOPConfig {
  @Bean
  public MusicAspect musicaspect() {
    return new MusicAspect();
  }
  
  @Bean
  public Speaker speakerpop() {
    return new SpeakerPop();
  }
  
  @Bean
  public Speaker speakerkpop() {
    return new SpeakerKPop();
  }
  
  @Bean
  public Speaker speakerclassic() {
    return new SpeakerClassic();
  }
}

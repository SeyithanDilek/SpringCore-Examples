package lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
@ComponentScan("lazy")
public class AppConfig {
	@Bean
	public School getSchool() {
		return new School();
	}
	@Bean
	public Lesson getLesson() {
		return new Lesson();	
	}
	
	
	
	
	

}

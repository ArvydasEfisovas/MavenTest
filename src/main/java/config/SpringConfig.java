package config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import service.TestBean;;

@Configuration
public class SpringConfig {

	@Bean
	public TestBean getTestBean() {
		return new TestBean("","","",0,"");
	}
}

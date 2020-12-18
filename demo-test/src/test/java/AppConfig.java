/**
 * @author 罗康
 * @Description
 * @Date 创建于 2020/12/18 17:40
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


	@Bean
	public DemoDao getDemoDao() {
		return new DemoDao();
	}
}


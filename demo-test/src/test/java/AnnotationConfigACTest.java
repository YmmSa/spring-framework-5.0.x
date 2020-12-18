/**
 * @author 罗康
 * @Description
 * @Date 创建于 2020/12/18 17:39
 */

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigACTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(AppConfig.class);
		DemoDao bean = applicationContext.getBean(DemoDao.class);
		bean.query();
	}
}

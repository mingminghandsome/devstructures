package com.wish.mm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author mingminghandsome
 *
 */
// 扫描xxx包下的注解
@ComponentScan("com.wish.mm")
// 扫描xxx包下的mapper接口类
@MapperScan(basePackages = "com.wish.mm.dao")
@SpringBootApplication
public class MmApplication extends SpringBootServletInitializer {
	/**
	 * 无 applicationContext.xml 和 web.xml, 靠下述方式进行配置：
	 * <p>
	 * 1. 扫描当前package下的class设置自动注入的Bean<br/>
	 * 2. 也支持用@Bean标注的类配置Bean <br/>
	 * 3. 根据classpath中的三方包Class及集中的application.properties条件配置三方包，如线程池 <br/>
	 * 4. 也支持用@Configuration标注的类配置三方包.
	 */
	public static void main(String[] args) {
		SpringApplication.run(MmApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MmApplication.class);
	}
}

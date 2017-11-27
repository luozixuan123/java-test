package org.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Intellij IDEA.
 *
 * @Author LUOLIANG
 * @Date 2016/8/2
 * @Comment
 */
@SpringBootApplication
@MapperScan("org.springboot.dao")
public class SpringBootAjaxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAjaxApplication.class, args);
	}
}

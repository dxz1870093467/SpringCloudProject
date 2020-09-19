package cn.ekgc.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b>启动类</b>
 * @author Lenovo
 * version 4.1.0
 * since 4.1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class UserConsumer {
	public static void main(String[] args) {
		SpringApplication.run(UserConsumer.class,args);
	}
}

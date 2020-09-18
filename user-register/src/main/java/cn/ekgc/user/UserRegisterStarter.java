package cn.ekgc.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class UserRegisterStarter {
	public static void main(String[] args) {
		SpringApplication.run(UserRegisterStarter.class,args);
	}
}

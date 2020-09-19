package cn.ekgc.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * Hello world!
 *<b>项目启动类</b>
 * @author Lenovo
 * version 4.1.0
 * since 4.1.0
 */
@EnableEurekaClient
@MapperScan("cn.ekgc.user.dao")
@SpringBootApplication
public class UserProvider
{
    public static void main( String[] args )
    {
        SpringApplication.run(UserProvider.class,args);
    }
}

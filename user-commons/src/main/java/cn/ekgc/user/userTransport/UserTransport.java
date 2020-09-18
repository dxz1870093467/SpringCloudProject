package cn.ekgc.user.userTransport;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <b>用户传输层功能接口</b>
 * @author Lenovo
 * version 4.1.0
 * @since 1.0.0
 */
@FeignClient(name="user-provider")
@RequestMapping("/user")
public interface UserTransport {

}

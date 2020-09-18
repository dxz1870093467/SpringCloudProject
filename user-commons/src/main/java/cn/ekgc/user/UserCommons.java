package cn.ekgc.user;

import cn.ekgc.user.pojo.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "user-provider")
@RequestMapping("/user")
public interface UserCommons {

}

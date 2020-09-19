package cn.ekgc.user.userTransport;

import cn.ekgc.user.pojo.entity.User;
import cn.ekgc.user.pojo.vo.Page;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.POST;

/**
 * <b>用户传输层功能接口</b>
 * @author Lenovo
 * version 4.1.0
 * @since 1.0.0
 */
@FeignClient(name="user-provider")
@RequestMapping("/user")
public interface UserTransport {
	/**
	 * <b>获取当前的页数</b>
	 * @param Page<User>
	 * @author Lenovo
	 * @return
	 * @throw Exception
	 */
	@PostMapping("/page")
	Page<User> getPage(Page<User> page)throws Exception;
	/**
	 * <b>添加用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(@RequestBody User user) throws Exception;

	/**
	 * <b>修改用户信息</b>
	 * @author Lenovo
	 * @version 4.1.0
	 * @since 2.0.0
	 */
	@PostMapping("/update")
	boolean update(User user)throws Exception;

	/**
	 * <b>通过Id获得用户信息</b>
	 * @author Lenovo
	 * @version 4.1.0
	 * @since 2.0.0
	 */
	@PostMapping("/id")
	User getById(Long id)throws Exception;
}

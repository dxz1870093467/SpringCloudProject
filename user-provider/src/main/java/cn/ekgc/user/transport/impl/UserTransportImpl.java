package cn.ekgc.user.transport.impl;

import cn.ekgc.user.pojo.entity.User;
import cn.ekgc.user.pojo.vo.Page;
import cn.ekgc.user.service.UserService;
import cn.ekgc.user.userTransport.UserTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("userTransport")
@RequestMapping("/user")
public class UserTransportImpl implements UserTransport {
	@Autowired
	private UserService userService;
	@PostMapping("/page")
	@Override
	public Page < User > getPage(Page < User > page) throws Exception {
		return null;
	}

	/**
	 * <b>添加用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	@Override
	public boolean save(@RequestBody User user) throws Exception {

		return userService.save(user);
	}
	/**
	 * <b>修改用户信息</b>
	 * @author Lenovo
	 * @version 4.1.0
	 * @since 2.0.0
	 */
	@PostMapping("/update")
	@Override
	public boolean update(User user) throws Exception {
		return false;
	}
	/**
	 * <b>通过Id获得用户信息</b>
	 * @author Lenovo
	 * @version 4.1.0
	 * @since 2.0.0
	 */
	@PostMapping("/id")
	@Override
	public User getById(Long id) throws Exception {
		return null;
	}


}

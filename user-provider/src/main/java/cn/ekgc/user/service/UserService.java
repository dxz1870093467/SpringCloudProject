package cn.ekgc.user.service;

import cn.ekgc.user.pojo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * <b>用户功能业务层接口</b>
 * @author Lenovo
 * version 4.1.0
 * since 4.1.0
 */
public interface UserService {
	/**
	 * <b>保存用户信息</b>
	 * @return
	 * @throws Exception
	 */
	boolean save(User user)throws Exception;
}

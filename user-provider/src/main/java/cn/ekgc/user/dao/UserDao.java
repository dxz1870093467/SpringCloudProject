package cn.ekgc.user.dao;

import cn.ekgc.user.pojo.entity.User;

/**
 * <b>数据持久层</b>
 */
public interface UserDao {
	/**
	 * <b>保存用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	Integer save(User user)throws Exception;
}

package cn.ekgc.user.dao;

import cn.ekgc.user.pojo.entity.User;

import java.util.List;

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
	/**
	 * <b>根据查询对象获得用户信息</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<User> findListByQuery(User query)throws Exception;

	/**
	 * <b>修改用户信息</b>
	 * @param user
	 * @throws Exception
	 * @return Integer
	 */
	Integer update(User user)throws Exception;
}

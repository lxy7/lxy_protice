
package com.luxy.stu.mapper;
import java.util.HashMap;

import com.luxy.stu.entity.User;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2019年12月31日
 * @email: luxy@primeton.com
 */
public interface UserMapper {
	
	public User getUser(String id);
	
	public User login(HashMap map);

}

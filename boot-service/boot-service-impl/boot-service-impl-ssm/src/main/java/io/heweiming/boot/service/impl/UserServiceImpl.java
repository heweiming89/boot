package io.heweiming.boot.service.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import io.heweiming.boot.mapper.UserMapper;
import io.heweiming.boot.model.User;
import io.heweiming.boot.model.UserExample;
import io.heweiming.boot.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, UserExample, UserMapper> implements UserService {

	@Override
	@Cacheable(value = "user")
	public User selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return super.selectByPrimaryKey(id);
	}

}

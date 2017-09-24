package io.heweiming.boot.service.service.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import io.heweiming.boot.service.mapper.UserMapper;
import io.heweiming.boot.service.model.User;
import io.heweiming.boot.service.model.UserExample;
import io.heweiming.boot.service.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, UserExample, UserMapper> implements UserService {

	@Override
	@Cacheable(value = "user")
	public User selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return super.selectByPrimaryKey(id);
	}

}

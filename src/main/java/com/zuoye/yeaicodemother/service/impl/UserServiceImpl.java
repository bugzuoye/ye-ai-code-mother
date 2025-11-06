package com.zuoye.yeaicodemother.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.zuoye.yeaicodemother.model.entity.User;
import com.zuoye.yeaicodemother.mapper.UserMapper;
import com.zuoye.yeaicodemother.service.UserService;
import org.springframework.stereotype.Service;

/**
 *  服务层实现。
 *
 * @author <a href="https://github.com/bugzuoye">作业</a>
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>  implements UserService{

}

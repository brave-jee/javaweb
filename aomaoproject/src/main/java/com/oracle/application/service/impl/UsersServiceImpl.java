package com.oracle.application.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.oracle.application.entity.Users;
import com.oracle.application.mapper.UsersMapper;
import com.oracle.application.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangchaoyang
 * @since 2024-10-16
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public boolean login(Users users){ //用户名 密码
        //根据用户输入的登录名查询数据库 获取用户对象数据
        //用户数据存在进行密码校验
        Users users1 = this.usersMapper.selectOne(new LambdaQueryWrapper<>(new Users()).eq(Users::getUserName,users.getUserName()));
        if(users1==null){
            return false;
        }
        if (!users1.getUserPass().equals(users.getUserPass())){
            return false;
        }
        //将查询到的对象数据赋值给前台传过来的对象
        BeanUtils.copyProperties(users1,users);
        users.setUserPass(null);
        return true;
    }

}

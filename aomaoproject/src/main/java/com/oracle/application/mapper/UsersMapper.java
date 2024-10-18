package com.oracle.application.mapper;

import com.oracle.application.entity.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhangchaoyang
 * @since 2024-10-16
 */
public interface UsersMapper extends BaseMapper<Users> {

//    @Select("SELECT * FROM USERS WHERE USERNAME=#{userName}")
    Users selectUserByName(String userName);

}

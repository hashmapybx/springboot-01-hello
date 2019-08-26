package com.tx.springboot.mapper;

import com.tx.springboot.entity.User;
import org.springframework.stereotype.Repository;


/**
 * 数据查询功能操作
 */
@Repository
public interface UserMapper {


    User sel(int id);


    int insertUser(User user);
}

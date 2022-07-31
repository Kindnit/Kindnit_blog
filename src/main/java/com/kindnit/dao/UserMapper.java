package com.kindnit.dao;

import com.kindnit.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    //获取用户名
    User getUserByName(@Param("username") String username);

}

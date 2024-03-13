package com.oxevry.DAO;

import com.oxevry.Model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDAO {
    @Select("select * from user where userName = #{user.userName}")
    User queryByUserName(@Param("user") User user);
}

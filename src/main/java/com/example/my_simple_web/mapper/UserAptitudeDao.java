package com.example.my_simple_web.mapper;

import com.example.my_simple_web.entity.UserAptitudePO;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;


//@org.apache.ibatis.annotations.Mapper
//public interface UserAptitudeDao extends Mapper<UserAptitudePO> {
//@Mapper
public interface UserAptitudeDao extends Mapper<UserAptitudePO> {
    String getOneById(@Param("id") Integer id);

//    UserAptitudePO getTwoById(@Param("id") Integer id);
}

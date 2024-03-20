package com.example526.dao;

import com.example526.dao.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
@Component
@Mapper
public interface UserEntityMapper {
    /*
    查询用户列表
     */
   List<UserEntity> queryUserList(UserEntity userEntity);

    /*
   创建用户的基本信息
    */
   int insert(UserEntity userEntity);

    /*
   根据id删除用户信息
    */
    int deleteUserById(UserEntity userEntity);

    /*
    编辑用户信息
     */
    int updateByPrimaryKeySelective(UserEntity userEntity);
    /*
    查询用户
     */
    List<UserEntity> selectUserInfo(UserEntity userEntity);
}
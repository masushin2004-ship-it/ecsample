package com.example.ecsample.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;

@Mapper
public interface UserMapper {

    /** メールアドレスでユーザを検索する */
    @Select("SELECT * FROM users WHERE email = #{email}")
    User findByEmail(String email);

    /** ユーザを登録する */
    @Insert("INSERT INTO users (name, email, password) VALUES (#{name}, #{email}, #{password})")
    void insert(User user);
}
package com.example.practice.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.practice.model.domain.User;

@Mapper
public interface UserMapper {
	//	『userName』,『password』を引数に、Userリストを返却するメソッド
	//	＊ 実働するSQLは〔 同名.xml 〕ファイルに記述されている
	List<User> findByUserNameAndPassword(
			@Param("userName") String userName,
			@Param("password") String password);

}

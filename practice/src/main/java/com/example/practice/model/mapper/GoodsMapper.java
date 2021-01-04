package com.example.practice.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.practice.model.domain.Goods;

@Mapper
public interface GoodsMapper {
	//	SQLの「Selectクエリ」を直接設定可能
	//		『findAll』メソッドが呼び出されると、当該SQLクエリが実行され、<テーブル> のリストが返却される
	@Select("Select * FROM goods")
	List<Goods> findAll();
	
	//	SQLの「Deleteクエリ」を直接設定可能
	//		『deleteById』メソッドが呼び出されると、当該SQLクエリが実行され、真偽値（Boolean型：true／false）が返却される
	@Delete("DELETE FROM goods WHERE Id = #{id}")
	boolean deleteById(long id);
}

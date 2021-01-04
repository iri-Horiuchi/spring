package com.example.practice.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import com.example.practice.model.domain.Purchase;
import com.example.practice.model.domain.dto.HistoryDto;

@Mapper
public interface PurchaseMapper {
	//		『userId』で履歴を検索（実働は PurchaseMapper.xml）
	List<HistoryDto> findHistory(@Param("userId") String userId);
	
	//		【 @Insert 】アノテーションより　Purchaseカラムにデータをインサートするメソッド
	@Insert("insert into purchase (user_id,goods_id,item_count,total) " + 
			"VALUES (#{userId},#{goodsId},#{itemCount},#{total})")
	@Options(useGeneratedKeys=true,keyProperty="id")
	void insert(Purchase purchase);
}						

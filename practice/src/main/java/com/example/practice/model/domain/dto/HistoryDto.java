package com.example.practice.model.domain.dto;

import java.sql.Timestamp;

import com.example.practice.model.domain.Goods;
import com.example.practice.model.domain.Purchase;

public class HistoryDto {
	private long id;
	private long userId;
	private long goodsId;
	private String goodsName;
	private long itemCount;
	private long total;
	private Timestamp createdAt;
	
	//		引数のないコンストラクタ
	public HistoryDto() {
		
	}
	
	//		引数１つのコンストラクタ
	public HistoryDto(Goods goods) {
		Purchase p = goods.getPurchaseList().get(0);
		
		this.setId(p.getId());
		this.setUserId(p.getUserId());
		this.setGoodsId(p.getGoodsId());
		this.setGoodsName(goods.getGoodsName());		// goodsテーブルより「商品名称」を取得
		this.setItemCount(p.getItemCount());
		this.setTotal(p.getTotal());
		this.setCreatedAt(p.getCreatedAt());
	}
	
	//	setter／getter　//
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }
    
	//	setter／getter　(Purchase)//
    public long getUserId(){
        return userId;
    }

    public void setUserId(long userId){
        this.userId = userId;
    }

    public long getGoodsId(){
        return goodsId;
    }

    public void setGoodsId(long goodsId){
        this.goodsId = goodsId;
    }

    public long getItemCount(){
        return itemCount;
    }

    public void setItemCount(long itemCount){
        this.itemCount = itemCount;
    }

    public long getTotal(){
        return total;
    }

    public void setTotal(long total){
        this.total = total;
    }

    public Timestamp getCreatedAt(){
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt){
        this.createdAt = createdAt;
    }
    
    //	setter／getter　(Goods)//
    public String getGoodsName(){
        return goodsName;
    }

    public void setGoodsName(String goodsName){
        this.goodsName = goodsName;
    }
}

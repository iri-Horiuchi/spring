package com.example.practice.model.form;

import java.io.Serializable;

public class PurchaseForm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long userId;
	private long goodsId;
	private long itemCount;
	private long total;
	
	//	setter／getter　//
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

}

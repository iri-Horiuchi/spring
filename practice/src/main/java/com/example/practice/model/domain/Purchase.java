package com.example.practice.model.domain;

import java.sql.Timestamp;

public class Purchase{
    //	変数宣言    //
    private long id;
    private long userId;
    private long goodsId;
    private long itemCount;
    private long total;
    private Timestamp createdAt;
    
    //	setter／getter　//
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

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

    public void setCeatedAt(Timestamp createdAt){
        this.createdAt = createdAt;
    }
}
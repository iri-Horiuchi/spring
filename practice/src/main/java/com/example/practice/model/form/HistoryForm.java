package com.example.practice.model.form;

import java.io.Serializable;

public class HistoryForm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String userId;
	
    //	setter／getter　//
    public String getUserId(){
        return userId;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }
}

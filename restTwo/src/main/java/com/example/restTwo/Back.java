package com.example.restTwo;

public class Back {
    private long id;
    private String back;

    public Back(long id, String back){
        this.id = id;
        this.back = back;
    }

    public long getId(){
        return id;
    }

    public String getBack(){
        return back;
    }
}

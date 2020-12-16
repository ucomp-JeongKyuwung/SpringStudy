package com.example.restTwo;

public class MyHome {

    private final long id;
    private final String whereTo;

    public MyHome(long id, String whereTo){
        this.id = id;
        this.whereTo = whereTo;
    }

    public long getId(){
        return id;
    }

    public String getWhereTo(){
        return whereTo;
    }

}

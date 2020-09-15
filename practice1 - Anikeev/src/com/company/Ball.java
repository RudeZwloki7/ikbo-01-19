package com.company;

public class Ball {
    private String name;
    private String size;

    Ball(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSize(){
        return this.size;
    }
    public void setSize(String size){
        this.size = size;
    }

    public String toString() {
        return "Ball\n"+"Name:"+getName()+"\nSize: "+getSize()+"\n";
    }
}

package com.company;

public class Dog {
    private String name;
    private String breed;

    Dog(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    public String toString() {
        return "Dog\n"+"Name:"+getName()+"\nBreed: "+getBreed()+"\n";
    }
}

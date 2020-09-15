package com.company;

public class ClassTester {
    public void Test() {
        Dog sobaka = new Dog("Viki");
        Ball myach = new Ball("football ball");
        Book kniga = new Book("Ten Little Negro");
        sobaka.setBreed("Korgi");
        myach.setSize("medium");
        kniga.setAuthor("Agata Kristi");
        System.out.println(sobaka.toString() + '\n' + myach.toString() + '\n' + kniga.toString());
    }
}

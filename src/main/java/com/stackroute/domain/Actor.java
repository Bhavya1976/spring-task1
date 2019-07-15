package com.stackroute.domain;


public class Actor {

    private String name;
    private String gender;
    private int age;



    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //display the actor information
    public void display(){
        System.out.println("name:\t"+name+" "+"\tgender:\t"+gender+" "+"\tage:\t"+age);
    }


}

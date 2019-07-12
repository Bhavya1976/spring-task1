package com.stackroute.domain;

public class Actor
{

   //variables declaration
    private String name;
    private String gender;
    private int age;

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    //getter method for name
    public String getName() {
        return name;
    }

    //setter method for name
    public void setName(String name) {
        this.name = name;
    }

    //getter method for gender
    public String getGender() {
        return gender;
    }

    //setter method for gender
   public void setGender(String gender) {
        this.gender = gender;
    }

    //getter method for age
    public int getAge() {
        return age;
    }

    //setter method for age
    public void setAge(int age) {
        this.age = age;
    }

   public void information(){

       System.out.println("Name\t" + name + "\tAge\t" + age + "\tGender\t" +gender);
   }
}

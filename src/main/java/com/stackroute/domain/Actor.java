package com.stackroute.domain;

public class Actor
{

   //variables declaration
    private String name;
    private String gender;
    private int age;

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
    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

}

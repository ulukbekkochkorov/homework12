package com.company;

public class Dog {
    private String name;
    private String color;
    private double age;

    public void setName (String name1){
        name = name1;
    }    public String getName() {
        return name;
    }
    public void setColor (String color1){
        color = color1;
    }   public String getColor (){
        return color;
    }
    public void setAge (double age1){
         age = age1;
    }public double getAge (){
        return age;
    }
    void barking (){
        System.out.println("Гав,Гав,Гав");
    }
}

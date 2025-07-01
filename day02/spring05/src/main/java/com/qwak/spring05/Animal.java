package com.qwak.spring05;

//import java.lang.Object;

public class Animal {
    //public String name;
    private String name;    
    // protected String name; 
    private int age;    //동물의 나이

    public int getAge(){
        return age;
    }

    void setName(String name){
        this.name = name;

    }
    // 정확한 캡슐화를 위해서 필터링
    public void setAge(int age){
        // 음수나 너무큰수가 들어가지 않도록 막아줌
        if (age <=  0 ){
            this.age = 1; 
        }  else if (age > 20){
            this.age = 20;      //너무 큰수 막기
        }  else {
        this.age = age;
        }
    }

    String getName(){
        return this.name;
    }
    void cry(){
        System.out.println(this.name + "이(가) 웁니다.");
    }
}

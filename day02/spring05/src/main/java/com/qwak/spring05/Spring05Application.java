package com.qwak.spring05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring05Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring05Application.class, args);

		
	// 상속
	Dog ppoppy = new Dog();
	ppoppy.setName("뽀삐");
	ppoppy.cry();
	// ppoppy.age = 8;
	ppoppy.setAge(450);

	Cat kitty = new Cat();
	kitty.setName("키티");
	kitty.cry();
	//kitty.age = 3;
	kitty.setAge(12);
	System.out.println(("키티의 나이는") + kitty.getAge() +"살");

	Dog choonsam = new Dog();
	choonsam.setName("춘삼"); 
	choonsam.cry();
	System.out.println(choonsam.getClass().getSimpleName());	// object 클래스 메서드 사용 가능

	
	
	}

}

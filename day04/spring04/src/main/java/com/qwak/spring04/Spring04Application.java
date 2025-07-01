package com.qwak.spring04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring04Application {

	

	public static void main(String[] args) {
		SpringApplication.run(Spring04Application.class, args);

		//람다식
		//1. 일반방식
		Spring04Application app = new Spring04Application();
		System.out.println(app.helloJava());

		//2. 기존익명함수
		// 	System.out.println(new lamdaFunc(){
		// 		public int max(int a, int b){
		// 			return a > b ? a : b;
		// 		}
		// 	}.max(14,34));
		// }

		// 2.람다 방식 
		myFuncInterface fi = () -> {System.out.println("hello java 람다호출");};
		fi.printHello();

		myCalc calc = (x, y) -> { return x + y; };
		int result = calc.plus(100, 55);
		System.out.println(result);

		
		//Steram API
		List<String> avengers = Arrays.asList("아이언맨","캡틴아메리카","스파이더맨","헐크");

		Collections.sort(avengers);
		System.out.println(avengers);

		for (String gero : avengers){
			System.out.println(hero);
		}


		List<String> lastList = new ArrayList<>();
		for (String elmt : copyList) {
			if (elmt.strtsWith("c")){
				lastList.add(elmt);
			}
		}
	}
		// 2. 대문자변경
		for (int i=0; i< lastList.size(); i++){
			lastList[i] = (String)lastList[i]
		}
	
	
		public String helloJava(){
			return "hello java 일반 호출";
		}
		
		@FunctionalInterface	//함수형 인터페이스로 지칭
		public interface myFuncInterface {
			void printHello();
		}

		public interface myCalc{
			int plus(int x, int y);
			int minus(int x, int y);
		}
}

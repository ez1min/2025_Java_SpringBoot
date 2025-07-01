package com.qwak.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);


		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append("java!");
	
		System.out.println(sb.toString());
		System.out.println(sb);		//StringBuilder 객체만으로도 출력

		StringBuilder sb2 = new StringBuilder("Hi ");
		sb2.append("hugo!");
		System.out.println(sb2.toString());
		//리스트 처럼 중간에 내용물 삽입 가능
		sb2.insert(2,"Nice to meet you, ");
		System.out.println(sb2.toString());
		// 문자열 길이
		System.out.println(sb2.length());
		// 문자열 삭제
		sb2.delete(19, 25);
		System.out.println(sb2.toString());
		//인덱스 위치 문자하나 삭제
		sb2.deleteCharAt(3);
		System.out.println(sb2.toString());

		//문자열 거꾸로 출력
		System.out.println(sb2.reverse());
		sb2.reverse();

		//문자열 대체
		sb2.replace(0, 1, "h");
		System.out.println(sb2.toString());
	
		//문자열 자르기, 자른 값을 다른 변수에 할당해야 함
		System.out.println(sb2.substring(9).toString());
		System.out.println(sb2.toString());

		StringBuilder sb3 = new StringBuilder("     Hello     ");
		System.out.println(sb2.toString());
		

	}

	
}

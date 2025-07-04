package com.qwak.spring01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);

		LocalDate date1 = LocalDate.now();
		System.out.println(date1);

		LocalDate date2 = LocalDate.of(2017,07,9);
		System.out.println(date2);

		String date3 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss"));
		System.out.println(date3);

		System.out.println(LocalDate.now().getDayOfYear());
		System.out.println(LocalDate.now().getMonth());
		System.out.println(LocalDate.now().getMonthValue());
		System.out.println(LocalDate.now().getDayOfMonth());
		System.out.println(LocalDate.now().getDayOfYear());
		
	}

}

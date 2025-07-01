package com.qwak.spring02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring02Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring02Application.class, args);

		//제네릭
		Storage<String> storage1 = new Storage<String>();
		storage1.setItem("iconic");
		System.out.println(storage1.getItem());

		//제네릭 정수사용
		Storage<Float> storage2 = new Storage<>();
		storage2.setItem(3.141592F);
		System.out.println(storage2.getItem());

		Spring02Application app = new Spring02Application();
		System.out.println(app.convert(storage1));
		System.out.println(app.convert(storage2));
	}
	//스토리지에 들어온 아이템을 문자로 분리해서 리스트에 담음
	public <P> List<char> convert(Storage<P> storage){
		Arraylist<Character> list = new ArrayList<>();

		String s = String.valueOf((storage.getItem()));
			for (int i =0; i<s.length(); i++){
				list.add(s.charAt(i));
			}

			return list;
	}

}

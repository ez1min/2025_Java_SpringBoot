package com.qwak.spring02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.io.FileWriter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring02Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring02Application.class, args);

        // 파일 쓰기
		FileOutputStream output = new FileOutputStream("C:/temp/text.txt");
        

		for(int i =0; i<10; i++){
			StringBuilder sb = new StringBuilder(i + "번째 줄입니다.\n");
			output.write(sb.toString().getBytes(Charset.defaultCharset()));

		}

		output.close();
		System.out.println("파일 생성 완료");
		
		//FileWriter
		FileWriter fw = new FileWriter(("C:/temp/fwtext.txt"));

		for (int i =0; i<10; i++){
			String str = (i+1) + "번째 줄입니다.\n";
			fw.write(str);
		}
		fw.close();
		System.out.println("filewriter 파일 생성 완료");
    }
}

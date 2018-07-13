package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPredicateApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringPredicateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String date1 = "05/06/2018";
		String date2 = "05/03/2017";
		String st = "1493577000000";
		Date parse = simpleDateFormat.parse(date2);
		long time = parse.getTime();
		System.out.println(time);
	long st1 = Long.parseLong(st);
		Date date = new Date(st1);
	
		System.out.println();
		
		
		
		
	}
}

package com.lucas.polls;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EntityScan(basePackageClasses = { PollsApplication.class, Jsr310JpaConverters.class })
public class PollsApplication {
	
	@PostConstruct
	void init() {
		TimeZone tzone = TimeZone.getTimeZone("America/Sao_Paulo");
		TimeZone.setDefault(tzone);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PollsApplication.class, args);
	}
}

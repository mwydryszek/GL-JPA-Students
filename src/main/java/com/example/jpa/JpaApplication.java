package com.example.jpa;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

// List studentów -> h2
// Rest -> odwołuje się do bazy h2
// h2 ma dane poczatkowe (import.sql)
// Student ma adres, relacja z inna tabelą
// GET (rest) zwracający listę Studentów po jakimś kryterium np. Imie
// termin: 17.02.2023


}

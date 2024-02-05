package com.pluralsight.springdataoverview;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pluralsight.springdataoverview.entity.Flight;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;


//@SpringBootTest
//@DataJpaTest
@SpringBootApplication
class SpringDataOverviewApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataOverviewApplication.class, args);
	}


}

package com.tw.nho.practicesystem;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;

@SpringBootApplication
public class PracticeSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeSystemApplication.class, args);
    }

    @Bean
    @Autowired
    public JPAQueryFactory jpaQuery(EntityManager entityManager) {
        return new JPAQueryFactory(entityManager);
    }

}

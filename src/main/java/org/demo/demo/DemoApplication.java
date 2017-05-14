package org.demo.demo;

import org.demo.demo.entity.CourseNumbers;
import org.demo.demo.entity.Pair;
import org.demo.demo.repository.CourseNumbersRepository;
import org.demo.demo.repository.GroupNumbersRepository;
import org.demo.demo.repository.PairRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.temporal.WeekFields;
import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
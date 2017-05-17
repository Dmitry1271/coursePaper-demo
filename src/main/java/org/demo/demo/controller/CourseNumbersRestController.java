package org.demo.demo.controller;

import org.demo.demo.entity.CourseNumbers;
import org.demo.demo.repository.CourseNumbersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class CourseNumbersRestController {

    @RequestMapping(value = "/courses",method = RequestMethod.GET)
    private List<CourseNumbers> getAllCourses(){
        return this.courseNumbersRepository.findAll();
    }




    @Autowired
    CourseNumbersRepository courseNumbersRepository;
}

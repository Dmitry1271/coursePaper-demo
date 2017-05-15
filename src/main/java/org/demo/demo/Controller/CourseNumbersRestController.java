package org.demo.demo.Controller;

import org.demo.demo.entity.CourseNumbers;
import org.demo.demo.repository.CourseNumbersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by cplus on 15.05.2017.
 */
@CrossOrigin(origins = "*")
@RestController
public class CourseNumbersRestController {

    @RequestMapping(value = "/get-courses",method = RequestMethod.GET)
    private List<CourseNumbers> getCourses(){
        return this.courseNumbersRepository.findAll();
    }



    @Autowired
    private CourseNumbersRepository courseNumbersRepository;
}
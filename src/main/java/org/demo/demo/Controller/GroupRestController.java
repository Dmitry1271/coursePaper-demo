package org.demo.demo.Controller;

import org.demo.demo.entity.GroupNumbers;
import org.demo.demo.repository.GroupNumbersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by cplus on 15.05.2017.
 */

@CrossOrigin(origins = "*")
@RestController
public class GroupRestController {

    @RequestMapping(value = "/allGroups", method = RequestMethod.GET)
    private Collection<GroupNumbers> allGroups() {
        return this.groupNumbersRepository.findAll();
    }

    // @RequestMapping(value = "/groups",method = RequestMethod.GET)
    //  private Collection<GroupNumbers> groupsByCourseIndex(@RequestParam(value = "course",required = false)int course){
    //      return this.groupNumbersRepository.findGroupNumbersByCourse(course);
    //  }


    @Autowired
    private GroupNumbersRepository groupNumbersRepository;
}

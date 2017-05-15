package org.demo.demo.Controller;

import org.demo.demo.entity.GroupNumbers;
import org.demo.demo.repository.GroupNumbersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

/**
 * Created by cplus on 15.05.2017.
 */

@CrossOrigin(origins = "*")
@RestController
public class GroupNumbersRestController {

    @RequestMapping(value = "/get-all-groups", method = RequestMethod.GET)
    private List<GroupNumbers> allGroups() {
        return this.groupNumbersRepository.findAll();
    }

     //@RequestMapping(value = "/get-groups",method = RequestMethod.GET)
     // private List<GroupNumbers> groupsByCourseIndex(@RequestParam(value = "course",required = false)int course){
      //    return this.groupNumbersRepository.findGroupNumbersByGroupIndex(course);
      //}


    @Autowired
    private GroupNumbersRepository groupNumbersRepository;
}

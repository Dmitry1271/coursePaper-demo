package org.demo.demo.Controller;

import com.sun.org.apache.regexp.internal.RE;
import org.demo.demo.entity.Pair;
import org.demo.demo.repository.PairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class PairRestController {

    @RequestMapping(value = "/allPairs", method = RequestMethod.GET)
    private Collection<Pair> allPairs() {
        return this.pairRepository.findAll();
    }

    @RequestMapping(value = "/pairs", method = RequestMethod.GET)
    private Collection<Pair> pairsSuchCourseGroupWeekdayIndex(@RequestParam(value = "course", required = false) int course,
                                                              @RequestParam(value = "group", required = false) int group,
                                                              @RequestParam(value = "weekday", required = false) int weekday) {
        return this.pairRepository.findPairsByStudentCourseAndStudentGroupAndWeekdayIndex(course, group, weekday);
    }


    @Autowired
    PairRepository pairRepository;
}

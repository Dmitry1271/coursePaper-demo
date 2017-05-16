package org.demo.demo.controller;

import org.demo.demo.entity.Pair;
import org.demo.demo.repository.PairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class PairRestController {

    @RequestMapping(value = "/allpairs", method = RequestMethod.GET)
    private List<Pair> allPairs() {
        return this.pairRepository.findAll();
    }

    @RequestMapping(value = "/pairs", method = RequestMethod.GET)
    private List<Pair> pairsSuchCourseGroupWeekdayIndex(@RequestParam(value = "day", required = false) int day,
                                                        @RequestParam(value = "group", required = false) int group,
                                                        @RequestParam(value = "course", required = false) int course,
                                                        @RequestParam(value = "even", required = false) int even){
        return this.pairRepository.findPairsByDayAndGroupIndexAndCourseIndexAndEvenDay(day, group,course,even);
    }


    @Autowired
    private PairRepository pairRepository;
}

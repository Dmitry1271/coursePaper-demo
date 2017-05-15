package org.demo.demo.Controller;

import com.sun.org.apache.regexp.internal.RE;
import org.demo.demo.entity.Pair;
import org.demo.demo.repository.PairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class PairRestController {

    @RequestMapping(value = "/get-all-pairs", method = RequestMethod.GET)
    private List<Pair> allPairs() {
        return this.pairRepository.findAll();
    }

    @RequestMapping(value = "/get-pairs", method = RequestMethod.GET)
    private List<Pair> pairsSuchCourseGroupWeekdayIndex(@RequestParam(value = "day", required = false) int day) {
        return this.pairRepository.findPairsByDay(day);
    }


    @Autowired
    private PairRepository pairRepository;
}

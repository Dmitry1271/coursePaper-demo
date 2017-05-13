package org.demo.demo.Controller;

import org.demo.demo.entity.Pair;
import org.demo.demo.repository.PairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class PairRestController {

    @RequestMapping("/allPairs")
    private Collection<Pair> pairs(){
        return this.pairRepository.findAll();
    }

    @Autowired
    PairRepository pairRepository;
}

package org.demo.demo.run;

import org.demo.demo.entity.Pair;
import org.demo.demo.repository.PairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PairCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
      for(Pair pair: this.pairRepository.findAll()){
           System.out.println(pair.toString());
       }
    }

    @Autowired
    PairRepository pairRepository;
}

package org.demo.demo.repository;

import org.demo.demo.entity.Pair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface PairRepository extends JpaRepository<Pair, Long> {
    List<Pair> findPairsByDay(int day);
}

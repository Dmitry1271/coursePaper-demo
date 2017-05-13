package org.demo.demo.repository;

import org.demo.demo.entity.Pair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface PairRepository extends CrudRepository<Pair, Long> {
    Collection<Pair> findPairsByCourseAndGroupAndWeekdayIndex(int course, int group, int weekdayIndex);
}

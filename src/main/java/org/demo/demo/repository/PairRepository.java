package org.demo.demo.repository;

import org.demo.demo.entity.Pair;
import org.demo.demo.entity.GroupNumbers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface PairRepository extends JpaRepository<Pair, Long> {

   // @Query("SELECT p FROM GroupNumbers gn left JOIN Pair p ON gn.id = p.groupId where p.day=:day AND gn.groupIndex =:group")
    @Query("select p from Pair p  where p.day=:day and p.groupId =:group and p.courseId =:course and (p.evenDay = 0 or p.evenDay =:evenDay)")
    List<Pair> findPairsByDayAndGroupIndexAndCourseIndexAndEvenDay(@Param("day") int day, @Param("group") int group, @Param("course") int course,@Param("evenDay") int evenDay);

}

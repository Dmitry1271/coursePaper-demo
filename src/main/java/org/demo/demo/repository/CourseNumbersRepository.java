package org.demo.demo.repository;

import org.demo.demo.entity.CourseNumbers;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by cplus on 15.05.2017.
 */
public interface CourseNumbersRepository extends JpaRepository<CourseNumbers,Long> {
}

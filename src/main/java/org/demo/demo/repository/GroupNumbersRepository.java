package org.demo.demo.repository;

import org.demo.demo.entity.GroupNumbers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

/**
 * Created by cplus on 14.05.2017.
 */
public interface GroupNumbersRepository extends JpaRepository<GroupNumbers,Long>{
}

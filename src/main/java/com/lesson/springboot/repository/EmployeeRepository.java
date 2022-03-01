package com.lesson.springboot.repository;

import com.lesson.springboot.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

    Optional<EmployeeEntity> findByFirstNameContaining(String firstName);

//    @Query("SELECT e FROM EmployeeEntity e WHERE e.firstName = :name AND  e.salary = :salary")
    @Query(value = "SELECT e.* FROM employee e WHERE e.first_name = :name AND e.salary = :salary", nativeQuery = true)
    List<EmployeeEntity> findAllByFirstNameAndSalary(@Param("name") String firstName, @Param("salary") Integer salary);
}

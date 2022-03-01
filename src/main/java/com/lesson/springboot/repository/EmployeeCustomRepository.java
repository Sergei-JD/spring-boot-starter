package com.lesson.springboot.repository;

import com.lesson.springboot.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeCustomRepository {

    List<EmployeeEntity> findCustomQuery();
}

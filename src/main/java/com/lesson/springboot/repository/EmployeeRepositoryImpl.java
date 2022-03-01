package com.lesson.springboot.repository;

import com.lesson.springboot.entity.EmployeeEntity;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
public class EmployeeRepositoryImpl implements EmployeeCustomRepository {

    private final EntityManager entityManager;

    @Override
    public List<EmployeeEntity> findCustomQuery() {
        return Collections.emptyList();
    }
}

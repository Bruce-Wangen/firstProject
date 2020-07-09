package com.example.demo.dao;

import com.example.demo.entity.People;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PeopleDao {

    People getById(Integer id);
}

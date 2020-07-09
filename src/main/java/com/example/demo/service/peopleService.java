package com.example.demo.service;

import com.example.demo.dao.PeopleDao;
import com.example.demo.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class peopleService {

    @Resource
    private  PeopleDao dao;

    public People getById(Integer id){
        return dao.getById(id);
    }

}

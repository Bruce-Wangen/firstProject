package com.example.demo.controller;

import com.example.demo.entity.People;
import com.example.demo.service.peopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/people")
//@CrossOrigin(origins = "*",allowCredentials="true",allowedHeaders = "",methods = {})
public class peopleController {

        @Autowired
        private peopleService service ;

        @ResponseBody
        @PostMapping(value = "/get/{id}")
        public People test(@PathVariable Integer id){
            System.out.println("id:" + id);
            return service.getById(id);
        }

}

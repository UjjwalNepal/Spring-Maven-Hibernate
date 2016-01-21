/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ujjwal.maven.api;

import com.ujjwal.maven.entity.Student;
import com.ujjwal.maven.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ujjwal
 */
@RestController
@RequestMapping(value = "/api/student")
public class StudentAPI {
    
    @Autowired
    StudentService sService;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Student> students(){
        return sService.getAll();
    }
}

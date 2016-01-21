/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ujjwal.maven.service;

import com.ujjwal.maven.entity.Student;
import java.util.List;

/**
 *
 * @author Ujjwal
 */
public interface StudentService {
    void insert(Student student);

    void update(Student student);
    
    List<Student> getAll();
    
    Student getByStudentId(int studentId);
}

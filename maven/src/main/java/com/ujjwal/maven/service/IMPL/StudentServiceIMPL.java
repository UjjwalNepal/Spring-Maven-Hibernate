/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ujjwal.maven.service.IMPL;

import com.ujjwal.webshop.dao.StudentDAO;
import com.ujjwal.maven.entity.Student;
import com.ujjwal.maven.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ujjwal
 */
@Service("StudentService")
@Transactional
public class StudentServiceIMPL implements StudentService{

    @Autowired
    StudentDAO sDAO;
    
    @Override
    public void insert(Student student) {
        this.sDAO.insert(student);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Student student) {
        this.sDAO.update(student);
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getAll() {
        return sDAO.getAll();
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getByStudentId(int studentId) {
        return sDAO.getByStudentId(studentId);
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

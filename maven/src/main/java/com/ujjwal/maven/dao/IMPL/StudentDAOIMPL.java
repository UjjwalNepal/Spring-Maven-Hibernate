/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ujjwal.maven.dao.IMPL;

import com.ujjwal.webshop.dao.StudentDAO;
import com.ujjwal.maven.entity.Student;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ujjwal
 */
@Repository
public class StudentDAOIMPL implements StudentDAO{
    
    @Autowired
    SessionFactory sessionFactory;
    Session session;
    
    @Override
    public void insert(Student student) {
        sessionFactory.getCurrentSession().save(student);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Student student) {
        sessionFactory.getCurrentSession().update(student);
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getAll() {
        session = sessionFactory.openSession();
        Transaction tx= session.beginTransaction();
        Criteria criteria=session.createCriteria(Student.class);
        List<Student> sList= criteria.list();
        tx.commit();
        session.close();
        return sList;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getByStudentId(int studentId) {
        Criteria criteria= sessionFactory.getCurrentSession().createCriteria(Student.class);
        criteria.add(Restrictions.ge("studentId", studentId));
        return (Student) criteria.uniqueResult();
    }
    
}

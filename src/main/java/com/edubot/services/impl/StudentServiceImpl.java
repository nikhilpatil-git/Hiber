package com.edubot.services.impl;

import com.edubot.daos.StudentDAO;
import com.edubot.entities.person.Student;
import com.edubot.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by deadcode on 29/10/2016.
 */
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDAO studentDAO;

    @Override
    public void insertStudent(Student student) {

        studentDAO.insertStudent(student);
    }

    @Override
    public void updateStudent(Student student) {

        studentDAO.updateStudent(student);
    }

    @Override
    public Student getStudentById(long id) {

        return studentDAO.getStudentById(id);
    }

    @Override
    public void updateEmailVerifyStatus(boolean emailStatus, long id) {

        studentDAO.updateEmailVerifyStatus(emailStatus, id);
    }

    @Override
    public Student getStudentFromFbId(long facebookId) {

        return studentDAO.getStudentById(facebookId);
    }
}

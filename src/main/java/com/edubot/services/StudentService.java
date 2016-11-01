package com.edubot.services;

import com.edubot.entities.person.Student;

/**
 * Created by deadcode on 29/10/2016.
 */
public interface StudentService {

    void insertStudent(Student student);

    void updateStudent(Student student);

    Student getStudentById(long id);

    void updateEmailVerifyStatus(boolean emailStatus, long id);

    Student getStudentFromFbId(long fbId);
}

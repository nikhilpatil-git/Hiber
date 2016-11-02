package com.edubot.daos;

import com.edubot.entities.person.Student;

/**
 * Created by deadcode on 12/08/2016.
 */
public interface StudentDAO {

    void insertStudent(Student student);

    void updateStudent(Student student);

    Student getStudentById(long id);

    void updateEmailVerifyStatus(boolean emailStatus, long id);

    Student getStudentFromFbId(long facebookId);
}

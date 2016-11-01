package com.edubot.daos.impl;

import com.edubot.daos.StudentDAO;
import com.edubot.daos.SuperDAO;
import com.edubot.entities.person.Student;

/**
 * Created by deadcode on 29/10/2016.
 */
public class StudentDAOImpl extends SuperDAO implements StudentDAO {

    private final String GET_STUDENT_FROM_ID = "from Student where student_id = %d";
    private final String GET_STUDENT_FROM_FACEBOOK_ID = "from Student where facebook_id = %d";
    private final String UPDATE_EMAIL_VERIFY_STATUS = "update Person set email_verify = %b where person_id = %d";

    @Override
    public void insertStudent(Student student) {

        save(student);
    }

    @Override
    public void updateStudent(Student student) {

        save(student);
    }

    @Override
    public Student getStudentById(long id) {

        Student student = (Student)getSingletonEntity(String.format(GET_STUDENT_FROM_ID, id));

        return student;
    }

    @Override
    public void updateEmailVerifyStatus(boolean emailStatus, long id) {

        updateSingletonEntity(String.format(UPDATE_EMAIL_VERIFY_STATUS, emailStatus, id));
    }

    @Override
    public Student getStudentFromFbId(long facebookId) {

        Student student = (Student)getSingletonEntity(String.format(GET_STUDENT_FROM_FACEBOOK_ID, facebookId));

        return student;
    }
}

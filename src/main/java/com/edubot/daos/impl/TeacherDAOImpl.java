package com.edubot.daos.impl;

import com.edubot.daos.SuperDAO;
import com.edubot.daos.TeacherDAO;
import com.edubot.entities.person.Teacher;

public class TeacherDAOImpl extends SuperDAO implements TeacherDAO {

    private final String GET_TEACHER_FROM_ID = "from Teacher where teacher_id = %d";
    private final String GET_TEACHER_FROM_EMAIL = "from Teacher where email = '%s'";
    private final String DELETE_TEACHER_FROM_ID = "delete from Teacher where teacher_id = %d";
    private final String UPDATE_TEACHER_ALIAS = "update Teacher set alias = '%s' where teacher_id = %d";
    private final String UPDATE_EMAIL_VERIFY_STATUS = "update Person set email_verify = %b where facebook_id = %d";
    private final String UPDATE_EMAIL = "update Person set email = '%s' where facebook_id = %d";
    private final String UPDATE_COLLEGE_NAME = "update Person set college_name = '%s' where facebook_id = %d";


    @Override
    public void insertTeacher(Teacher teacher) {

        save(teacher);
    }

    @Override
    public void insertEmail(String email, long id) {

        updateSingletonEntity(String.format(UPDATE_EMAIL, email, id));
    }

    @Override
    public void insertCollegeName(String collegeName, long id) {

        updateSingletonEntity(String.format(UPDATE_COLLEGE_NAME, collegeName, id));
    }

    @Override
    public void updateTeacher(Teacher teacher) {

        save(teacher);
    }

    @Override
    public void updateTeacherAlias(String alias, long id) {

        updateSingletonEntity(String.format(UPDATE_TEACHER_ALIAS, alias, id));
    }

    @Override
    public Teacher getTeacherFromId(long id) {

        Teacher teacher = (Teacher)getSingletonEntity(String.format(GET_TEACHER_FROM_ID, id));

        return teacher;
    }

    @Override
    public Teacher getTeacherFromEmail(String email) {

        Teacher teacher = (Teacher)getSingletonEntity(String.format(GET_TEACHER_FROM_EMAIL, email));

        return teacher;
    }

    @Override
    public void updateEmailVerifyStatus(boolean emailStatus, long id) {

        updateSingletonEntity(String.format(UPDATE_EMAIL_VERIFY_STATUS, emailStatus, id));
    }

    @Override
    public void deleteTeacher(long id) {

    }

}

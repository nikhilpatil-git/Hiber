package com.edubot.services.impl;

import com.edubot.daos.TeacherDAO;
import com.edubot.entities.person.Teacher;
import com.edubot.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by deadcode on 30/10/2016.
 */
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherDAO teacherDAO;

    @Override
    public void insertTeacher(Teacher teacher) {

        teacherDAO.insertTeacher(teacher);
    }

    @Override
    public void insertEmail(String email, long id) {


    }

    @Override
    public void updateTeacher(Teacher teacher) {

        teacherDAO.updateTeacher(teacher);
    }

    @Override
    public void updateTeacherAlias(String alias, long id) {

        teacherDAO.updateTeacherAlias(alias, id);
    }

    @Override
    public Teacher getTeacherFromId(long id) {

        return teacherDAO.getTeacherFromId(id);
    }

    @Override
    public void updateEmailVerifyStatus(boolean emailStatus, long id) {

        teacherDAO.updateEmailVerifyStatus(emailStatus, id);
    }

    @Override
    public void deleteTeacher(long id) {

    }
}

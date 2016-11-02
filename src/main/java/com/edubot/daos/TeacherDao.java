package com.edubot.daos;

import com.edubot.entities.person.Teacher;

public interface TeacherDAO {

    void insertTeacher(Teacher teacher);

    void insertEmail(String email, long id);

    void updateTeacher(Teacher teacher);

    void updateTeacherAlias(String alias, long id);

    Teacher getTeacherFromId(long id);

    Teacher getTeacherFromEmail(String email);

    void deleteTeacher(long id);

    void updateEmailVerifyStatus(boolean emailStatus, long id);
}
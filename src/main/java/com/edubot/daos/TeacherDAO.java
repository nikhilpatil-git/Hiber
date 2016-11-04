package com.edubot.daos;

import com.edubot.entities.person.Teacher;

/**
 * Created by I333496 on 02/11/2016.
 */
public interface TeacherDAO {
    void insertTeacher(Teacher teacher);

    void insertEmail(String email, long id);

    void insertCollegeName(String collegeName, long id);

    void updateTeacher(Teacher teacher);

    void updateTeacherAlias(String alias, long id);

    Teacher getTeacherFromId(long id);

    Teacher getTeacherFromEmail(String email);

    void deleteTeacher(long id);

    void updateEmailVerifyStatus(boolean emailStatus, long id);
}

package com.edubot.services;

import com.edubot.entities.person.Teacher;

public interface TeacherService {

    void insertTeacher(Teacher teacher);

    void insertEmail(String email, long id);

    void updateTeacher(Teacher teacher);

    void updateTeacherAlias(String alias, long id);

    Teacher getTeacherFromId(long id);

    void deleteTeacher(long id);

    void updateEmailVerifyStatus(boolean emailStatus, long id);
}

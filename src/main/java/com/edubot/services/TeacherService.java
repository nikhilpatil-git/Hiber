package com.edubot.services;

import com.edubot.entities.person.Teacher;
import com.edubot.forms.InstituteDetailForm;

public interface TeacherService {

    void insertTeacher(Teacher teacher);

    void insertInstituteDetails(InstituteDetailForm instituteDetailForm, long id);

    void updateTeacher(Teacher teacher);

    void updateTeacherAlias(String alias, long id);

    Teacher getTeacherFromId(long id);

    void deleteTeacher(long id);

    void updateEmailVerifyStatus(boolean emailStatus, long id);
}

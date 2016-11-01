package com.edubot;

import com.edubot.config.TeacherBean;
import com.edubot.services.TeacherService;
import com.edubot.services.impl.TeacherServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //Session session = HibernateUtil.getSessionFactory().openSession();

        //SaveTest saveTest = new SaveTest(session);


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TeacherBean.class);

        TeacherService teacherDAO = applicationContext.getBean(TeacherServiceImpl.class);

        System.out.println("TeacherEmailVerifyStatus"+ teacherDAO.getTeacherFromId(1).isEmailVerify());

//        StudentService studentDAO = applicationContext.getBean(StudentServiceImpl.class);
//        studentDAO.updateEmailVerifyStatus(false, 3);
//
//        System.out.println(studentDAO.getStudentById(3).isEmailVerify());

        //teacherDAO.updateTeacherAlias("Jango", 1);
        //teacherDAO.updateEmailVerifyStatus(false, 1);

    }
}

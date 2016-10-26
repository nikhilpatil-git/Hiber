package com.edubot.test_methods;

import com.edubot.entities.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by deadcode on 25/10/2016.
 */
public class SaveTest {

    private Session session;
    public SaveTest(Session session) {
        this.session = session;

        try{

            session.beginTransaction();

            Course course = saveCourse(saveTeacher());
            saveAssignment(course);
            Student student = saveStudent(course);

         //   saveStudentCourseJoin(student, course);

            session.getTransaction().commit();

        }catch (HibernateException hx){

            System.out.println("Something happened "+hx);

        }finally {
            session.close();
        }

    }

    public Teacher saveTeacher(){
        Teacher teacher = new Teacher();
        teacher.setName("Nikhil");
        teacher.setEmail("patilnikhil9@gmail.com");
        teacher.setCollegeName("DIT");
        teacher.setEmailVerify(true);
        teacher.setAlias("Mike");
        session.save(teacher);

        return teacher;
    }

    public Course saveCourse(Teacher teacher){

        Course course = new Course();
        course.setCourseName("Physics");
        course.setCourseDescription("this will take you another dimension");
        course.setTeacher(teacher);

        teacher.getCourses().add(course);

        session.save(course);


        return course;
    }

    public void saveAssignment(Course course){

        Date startDate = new Date();
        Date endDate = new Date();

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("25/10/2016");
        simpleDateFormat1.format(startDate);

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("25/10/2016");
        simpleDateFormat2.format(endDate);

        Assignment assignment = new Assignment();
        assignment.setTitle("Physics Assignment");
        assignment.setDescription("this is god");
        assignment.setStartDate(startDate);
        assignment.setEndDate(endDate);
        assignment.setNumberOfDays(7);
        assignment.setMarksPerQuestion(10);

        assignment.setCourse(course);
        course.getAssignments().add(assignment);

        session.save(assignment);

    }

    public Student saveStudent(Course course){

        Student student = new Student();
        student.setName("Mike");
        student.setCollegeName("Trinity");
        student.setFacebookId(191923929922L);
        student.setPageId(9390390393939L);
        student.setEmail("student202@gmail.com");
        session.save(student);

        Student student2 = new Student();
        student2.setName("Nike");
        student2.setCollegeName("DIT");
        student2.setFacebookId(191923929922L);
        student2.setPageId(9390390393939L);
        student2.setEmail("studdjdjd02@gmail.com");
        session.save(student2);

        Set<Student> students = new HashSet<>();
        students.add(student);
        students.add(student2);

        course.setStudents(students);

        return student;
    }

    public void saveStudentCourseJoin(Student student, Course course){

        StudentCourseJoin studentCourseJoin = new StudentCourseJoin();
        studentCourseJoin.setStudentId(student.getStudentId());
        studentCourseJoin.setCourseId(course.getCourseId());
        session.save(studentCourseJoin);
    }
}

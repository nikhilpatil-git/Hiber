package com.edubot.test_methods;

import com.edubot.entities.*;
import com.edubot.entities.story.MessageStoryLine;
import com.edubot.entities.story.QuestionStoryLine;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
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


/*            Course course = saveCourse(saveTeacher());
            Assignment assignment = saveAssignment(course);
            Student student = saveStudent(course);*/

            showMeQuestions();
            showMeStoryLines();

            // AbstractQuestion question = saveQuestion(assignment);


            session.getTransaction().commit();

        }catch (HibernateException hx){

            System.out.println("Something happened "+hx);

        }finally {
            session.close();
        }

    }

    public Teacher saveTeacher(){
        Teacher teacher = new Teacher();
        teacher.setName("Swati");
        teacher.setEmail("patilndddikhil9@gmail.com");
        teacher.setCollegeName("DdddIT");
        teacher.setEmailVerify(true);
        teacher.setAlias("Mikddde");
        session.save(teacher);

        return teacher;
    }

    public Course saveCourse(Teacher teacher){

        Course course = new Course();
        course.setCourseName("Chemistry");
        course.setCourseDescription("this will take you another dimension");
        course.setTeacher(teacher);

        teacher.getCourses().add(course);

        session.save(course);


        return course;
    }

    public Assignment saveAssignment(Course course){

        MCQQuestion question = new MCQQuestion();
        question.setText("what is a physics");
        question.setHint("who is issac newton");
        question.setOption1("something");
        question.setOption2("something");
        question.setOption3("something");
        question.setOption4("something");
        question.setRightAnswer(2);
        question.setSequence(1);

        TrueFalseQuestion trueFalseQuestion = new TrueFalseQuestion();
        trueFalseQuestion.setText("what is a physics");
        trueFalseQuestion.setHint("who is issac newton");
        trueFalseQuestion.setRightAnswer(1);
        question.setSequence(2);


        MessageStoryLine messageStoryLine = new MessageStoryLine();
        messageStoryLine.setText("All is good man");
        session.save(messageStoryLine);

        QuestionStoryLine questionStoryLine = new QuestionStoryLine();
        questionStoryLine.setQuestion(question);
        session.save(questionStoryLine);

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

        Set<AbstractQuestion> set = new HashSet<>();
        set.add(question);
        set.add(trueFalseQuestion);

        assignment.setQuestions(set);

        assignment.setCourse(course);
        course.getAssignments().add(assignment);

        question.setAssignment(assignment);
        trueFalseQuestion.setAssignment(assignment);

        session.save(question);
        session.save(trueFalseQuestion);
        session.save(assignment);

        return assignment;
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

        session.save(course);

        return student;
    }

    public MCQQuestion saveQuestion(Assignment assignment){

        MCQQuestion question = new MCQQuestion();
        question.setText("what is a physics");
        question.setHint("who is issac newton");
        question.setOption1("something");
        question.setOption2("something");
        question.setOption3("something");
        question.setOption4("something");
        question.setRightAnswer(2);
        question.setAssignment(assignment);
        session.save(question);

/*        TrueFalseQuestion trueFalseQuestion = new TrueFalseQuestion();
        trueFalseQuestion.setText("what is a physics");
        trueFalseQuestion.setHint("who is issac newton");
        trueFalseQuestion.setRightAnswer(1);
        session.save(trueFalseQuestion);*/

        MessageStoryLine messageStoryLine = new MessageStoryLine();
        messageStoryLine.setText("All is good man");
        session.save(messageStoryLine);

        QuestionStoryLine questionStoryLine = new QuestionStoryLine();
        questionStoryLine.setQuestion(question);
        session.save(questionStoryLine);

        return question;
    }

    public void showMeQuestions(){

       Query query = session.createQuery("from AbstractQuestion where question_type = 'MCQ'");

        Iterator iterator = query.list().iterator();

        while(iterator.hasNext()){

            MCQQuestion mcqQuestion = (MCQQuestion) iterator.next();

            System.out.println("QuestionText-"+mcqQuestion.getText());
            System.out.println("QuestionAssignmentTitle-"+mcqQuestion.getAssignment().getTitle());
        }
    }

    public void showMeStoryLines(){
        Query query = session.createQuery("from QuestionStoryLine ");

        Iterator iterator = query.list().iterator();

        while(iterator.hasNext()){

            QuestionStoryLine questionStoryLine = (QuestionStoryLine) iterator.next();

            System.out.println("StoryLineQuestionText-"+questionStoryLine.getQuestion().getText());
        }
    }

    public void showCourses(){


       Query query = session.createQuery("from Course");

        Iterator iterator = query.list().iterator();

        while(iterator.hasNext()){

            Course course = (Course)iterator.next();

            System.out.println("CourseName"+course.getCourseName());
            System.out.println("CollegeName"+course.getCourseDescription());

            Iterator i1 = course.getStudents().iterator();

            while(i1.hasNext()){

                Student student = (Student)i1.next();

                System.out.println("CourseStudentName"+student.getName());
                System.out.println("CourseStudentCollegeName"+student.getCollegeName());
                System.out.println("CourseStudentFacebookId"+student.getFacebookId());
            }

        }

    }


}

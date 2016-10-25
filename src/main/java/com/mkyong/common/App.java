package com.mkyong.common;

import com.mkyong.models.Assignment;
import com.mkyong.persistence.HibernateUtil;
import org.hibernate.Session;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate One-to-One example + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();

/*        com.mkyong.models.Teacher teacher = new Teacher();
        teacher.setPersonName("Nikhil");
        teacher.setEmail("patilnikhil9@gmail.com");
        teacher.setCollegeName("DIT");
        teacher.setEmailVerify(true);
        teacher.setAlias("Mike");

        session.save(teacher);

        Course course1 = new Course();
        course1.setCourseName("Physics");
        course1.setCourseDescription("this will take you another dimension");
        course1.setTeacher(teacher);

        teacher.getCourses().add(course1);

        session.save(course1);*/

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

        session.save(assignment);

/*        try{

            Teacher teacher = new Teacher();
            teacher.setTeacherName("Nikhil");
            teacher.setEmail("patilnikhil9@gmail.com");
            teacher.setCollegeName("DIT");
            teacher.setEmailVerify(true);
            session.save(teacher);

            Course course1 = new Course();
            course1.setCourseName("Physics");
            course1.setCourseDescription("this will take you another dimension");
            course1.setTeacher(teacher);

            teacher.getCourses().add(course1);

             session.save(course1);

        }catch (HibernateException hx){
            System.out.println("Error "+hx);
        }*/

    /*    Stock stock = new Stock();
        stock.setStockCode("7052");
        stock.setStockName("PADINI");
        session.save(stock);

        StockDailyRecord stockDailyRecords = new StockDailyRecord();
        stockDailyRecords.setPriceOpen(new Float("1.2"));
        stockDailyRecords.setPriceClose(new Float("1.1"));
        stockDailyRecords.setPriceChange(new Float("10.0"));
        stockDailyRecords.setVolume(3000000L);
        stockDailyRecords.setDate(new Date());

        stockDailyRecords.setStock(stock);
        stock.getStockDailyRecords().add(stockDailyRecords);

        session.save(stockDailyRecords);*/

        session.getTransaction().commit();

/*        try{

            List list = session.createQuery("from Teacher").list();

            for (Iterator iterator = list.iterator(); iterator.hasNext();){

                Teacher teacher = (Teacher) iterator.next();
                System.out.print("First Name: " + teacher.getPersonName());
                System.out.print("First Name: " + teacher.getEmail());
                System.out.print("First Name: " + teacher.getCollegeName());
                System.out.print("First Name: " + teacher.getAlias());

            }

            list = session.createQuery("from Student").list();

            for (Iterator iterator = list.iterator(); iterator.hasNext();){

                Student teacher = (Student) iterator.next();
                System.out.print("First Name: " + teacher.getPersonName());
                System.out.print("First Name: " + teacher.getEmail());
                System.out.print("First Name: " + teacher.getCollegeName());
                System.out.print("First Name: " + teacher.getFacebookId());
                System.out.print("First Name: " + teacher.getPageId());
            }

            session.getTransaction().commit();

        }catch (HibernateException hx){

            System.out.println("Something happened "+hx);

        }finally {
            session.close();
        }*/

/*        Stock stock = new Stock();
        
        stock.setStockCode("4715");
        stock.setStockName("GENM");
     
        StockDetail stockDetail = new StockDetail();
        stockDetail.setCompName("GENTING Malaysia");
        stockDetail.setCompDesc("Best resort in the world");
        stockDetail.setListedDate(new Date());
        
        stock.setStockDetail(stockDetail);
        stockDetail.setStock(stock);

        */
        
       // session.save(member);


        
        
    }
}

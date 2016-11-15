package com.edubot.controller;


import com.edubot.entities.person.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class StudentController extends ControllerHelper {


    /*
      a) Add student to the student table.
      b) Send email to the student for course confirmation.
    */
    //@PathVariable("sid") long sid,

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public int addStudent(HttpServletRequest request){

        System.out.println(getRequestBody(request));

        return 0;
    }

    @RequestMapping(value = "/student/confirm/{token}", method = RequestMethod.POST)
    public int addStudent(@RequestBody Student student, HttpServletRequest request){

        return 0;
    }

    @RequestMapping(value = "/student/course/{cid}", method = RequestMethod.POST)
    public ResponseEntity<Integer> inviteStudent(HttpServletRequest request, @PathVariable("cid") long cid){

        /**
         * Invite student to the class, send him/her a mail
         */

     //   studentService.sendStudentEmail(getBodyParameter(getRequestBody(request), "email"), courseService.getCourseFromId(cid), (Teacher)request.getAttribute("teacher"));

        return new ResponseEntity<>(0, getResponseHeaders(), HttpStatus.OK);
    }

}

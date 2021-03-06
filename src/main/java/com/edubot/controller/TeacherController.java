package com.edubot.controller;

import com.edubot.facades.TeacherFacade;
import com.edubot.forms.FacebookSignupForm;
import com.edubot.forms.InstituteDetailForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/*
    **** Operations ***

   Add New Teacher -- /teacher [POST(Create new teacher), DELETE(teacher), UPDATE(teacher details), GET(get the teacher details)]
*/

@RestController
public class TeacherController extends ControllerHelper {

    @Autowired
    private TeacherFacade teacherFacade;

    @RequestMapping(value = "/teacher/signup1", method = RequestMethod.POST)
    public ResponseEntity<Integer> registerFacebookDetails(@RequestBody FacebookSignupForm facebookSignupForm){

        /**
         * Generate token from the facebook signup details
         */
        String token = teacherFacade.registerPersonReturnToken(facebookSignupForm);

        /**
         * Embed generated token in response headers
         */
        embedTokenInResponse(token);

        return new ResponseEntity<>(101, getResponseHeaders(), HttpStatus.OK);
    }

    @RequestMapping(value = "/teacher/signup2", method = RequestMethod.POST)
    public ResponseEntity<Integer> registerInstituteDetails(HttpServletRequest request, @RequestBody InstituteDetailForm instituteDetailForm){

        teacherFacade.registerInstituteDetail(getSession(request), instituteDetailForm);

        return new ResponseEntity<>(101, getResponseHeaders(), HttpStatus.OK);
    }

/*    @RequestMapping(value = "/teacher/signin", method = RequestMethod.POST)
    public ResponseEntity<Integer> checkTeacherAuthenticity(HttpServletRequest request){

        String token;

        String requestBody = getRequestBody(request);

        String username = getBodyParameter(requestBody, "username");
        String password = getBodyParameter(requestBody, "password");

        responseHeaders.setLocation(URI.create(Const.ClientUris.CLIENT_HOME));

        int status = teacherService.authenticateTeacher(username, password);

        if(status == ResponseCodes.USERNAME_CORRECT_PASSWORD_CORRECT_EMAIL_VERIFY_PASSED){

            token = teacherService.generateAuthToken();

            responseHeaders.set("Authorization", token);
        }

        return new ResponseEntity<>(status, responseHeaders, HttpStatus.OK);
    }

    @RequestMapping(value="/teacher/confirm/{emailToken}", method = RequestMethod.GET)
    public ResponseEntity<Integer> confirmTeacher(HttpServletRequest request) { //@PathVariable("emailToken") String emailToken

        // default
        responseHeaders.setLocation(URI.create(Const.ClientUris.CLIENT_SIGN_UP));

        if(request.getHeader("Authorization") != null){
            responseHeaders.setLocation(URI.create(Const.ClientUris.CLIENT_HOME));
        }

        int status = teacherService.updateEmailVerifyStatus(getHashFromUrl(request));

        return new ResponseEntity<Integer>(status, responseHeaders, HttpStatus.OK);
    }

    @RequestMapping(value = "/teacher/{tid}", method = RequestMethod.GET)
    public Teacher getTeacher(@PathVariable("tid") long tid){

         return teacherService.getTeacherFromId(tid);
    }

    @RequestMapping(value = "/teacher/{tid}", method = RequestMethod.DELETE)
    public int deleteTeacher(@PathVariable("tid") long tid){

        return teacherService.deleteTeacher(tid);
    }

    @RequestMapping(value="/teacher/verify", method = RequestMethod.GET)
    public ResponseEntity<Integer> verifyTeacher(HttpServletRequest request) {

        responseHeaders.setLocation(URI.create(Const.ClientUris.CLIENT_HOME));

        return new ResponseEntity<Integer>(ResponseCodes.TOKEN_VALID, responseHeaders, HttpStatus.OK);
    }*/

}

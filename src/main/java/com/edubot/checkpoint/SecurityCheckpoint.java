package com.edubot.checkpoint;

import com.edubot.facades.SecurityFacade;
import com.edubot.util.AllowedUrls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecurityCheckpoint extends HandlerInterceptorAdapter {

    @Autowired
    SecurityFacade securityFacade;

    //before the actual handler will be executed
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String authToken;

         if((authToken = request.getHeader("Authorization")) != null){



        }
         else if(AllowedUrls.check(request.getRequestURI())){

             return true;
         }

        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);


        System.out.println("I am third");

    }
}

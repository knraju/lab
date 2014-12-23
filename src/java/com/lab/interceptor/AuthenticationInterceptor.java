/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 *
 * @author Chari
 */
@Component
public class AuthenticationInterceptor extends HandlerInterceptorAdapter{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       
        String username = (String)request.getSession().getAttribute("username");
        String uri = request.getRequestURI();
        System.out.println("uri======"+uri);
        
        if( !uri.endsWith("login.htm") && !uri.endsWith("logout.htm")){
            
            if(username==null){
                response.sendRedirect("/lab/login.htm");
                return false;
            }
        }
        
        if( uri.endsWith("login.htm") || uri.endsWith("/") ){
            if(username!=null){
                System.out.println("inside emailid notequal to null");
                String userType = (String)request.getSession().getAttribute("userType");
                String contextPath = request.getContextPath()+"/";
               
                response.sendRedirect(contextPath+userType.toLowerCase()+"/home.htm");
                return false;
            }
        }
        return true;
    }
}

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    application.setAttribute("Application Context","Merry Christmas");
    System.out.println(application == request.getServletContext());
    response.sendRedirect("getApplicationContext.jsp");
%>
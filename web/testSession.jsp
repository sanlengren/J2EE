<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%
    session.setAttribute("test", 1);
    session.setAttribute("test", 2);
    session.removeAttribute("test");
%>这个页面做了以下操作，具体执行结果可以看console.
<Br/>
    session.setAttribute("test", 1);
    <Br/>session.setAttribute("test", 2);
   <Br/> session.removeAttribute("test");
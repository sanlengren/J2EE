<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%
    request.setAttribute("test", 1);
    request.setAttribute("test", 2);
    request.removeAttribute("test");
%>
执行的操作是：
 <Br/>   request.setAttribute("test", 1);
  <Br/>    request.setAttribute("test", 2);
  <Br/>    request.removeAttribute("test");
   <Br/> 执行结果见后台的console
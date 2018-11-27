<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%=request.getAttribute("Request Context")%>

<Br/>
通过server端做了跳转，依然是在一个request里面，所以新页面调用可以拿到request conext里面内容！
<Br/>
如果你没有先跳到set页面直接打开这个get页面，就会读取不到！看到的是null
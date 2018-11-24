<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%=request.getAttribute("Request Context")%>

<Br/>
因为从上一个页面跳转的时候使用的是客户端跳转redirect，跳转过来之后会发出新的request,所以上一次request context内容无法跳转后页面读取！
<Br/>
尝试读取出来的结果就是Null
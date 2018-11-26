<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="listener.OnlineNumberListener"%>

<%
response.setIntHeader("Refresh", 5);
//上面这一句的目的是每5秒刷新一次页面，但是由于本页面的刷新，会延长这个session的存活时间，所以体现位一直不timeout，就不会销毁
//如果要看到数字变化，需要考虑用另外一个客户端打开页面（此时+1），然后关闭（防止另外一个页面也刷新，但是session由于timeout限制
//会存活一段时间，等待这个新页面的session销毁了就可以看到数字变化了（-1）
OnlineNumberListener a = new OnlineNumberListener();
    int totalcount = a.getTotalNumber();
//     String fullSession = session.getId();
%>
    
<%-- <%=application.getAttribute("Application Context")%> --%>
获取到的total number 是<%=totalcount%>
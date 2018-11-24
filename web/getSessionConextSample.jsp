<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%=session.getAttribute("Session Context")%>

<Br/>
如果直接打开这个页面，得到的值是null，因为还没有设置session context的值。
<Br/>
从setSessionContextSample跳转过来，读取到值
<Br/>
在session的有效期内（tomcat默认设置是30分钟，都是有效的）
当tomcat--》stop server，tomcat会将内存中的session信息序列化到硬盘上，除非非正常关闭，Tomcat未完成持久化工作
另外存储到其中的对象需要直接序列化，才可以被恢复过来。
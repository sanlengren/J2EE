import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowDifferentRequestInfoServlet extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        String name = request.getParameter("name");
//        String password = request.getParameter("password");
 
		
//		request.getRequestURL(): 浏览器发出请求时的完整URL，包括协议 主机名 端口(如果有)" + 
//		request.getRequestURI(): 浏览器发出请求的资源名部分，去掉了协议和主机名" + 
//		request.getQueryString(): 请求行中的参数部分，只能显示以get方式发出的参数，post方式的看不到
//		request.getRemoteAddr(): 浏览器所处于的客户机的IP地址
//		request.getRemoteHost(): 浏览器所处于的客户机的主机名
//		request.getRemotePort(): 浏览器所处于的客户机使用的网络端口
//		request.getLocalAddr(): 服务器的IP地址
//		request.getLocalName(): 服务器的主机名
//		request.getMethod(): 得到客户机请求方式一般是GET或者POST
		
        System.out.println("浏览器发出请求时的完整URL，包括协议 主机名 端口(如果有): " + request.getRequestURL());
        System.out.println("浏览器发出请求的资源名部分，去掉了协议和主机名: " + request.getRequestURI());
        System.out.println("请求行中的参数部分: " + request.getQueryString());
        System.out.println("浏览器所处于的客户机的IP地址: " + request.getRemoteAddr());
        System.out.println("浏览器所处于的客户机的主机名: " + request.getRemoteHost());
        System.out.println("浏览器所处于的客户机使用的网络端口: " + request.getRemotePort());
        System.out.println("服务器的IP地址: " + request.getLocalAddr());
        System.out.println("服务器的主机名: " + request.getLocalName());
        System.out.println("得到客户机请求方式: " + request.getMethod());
 
        StringBuilder html = new StringBuilder();
        html.append("<<<这一部分是打印request里面带有的基本信息>>>").append("<br />");
        html.append("浏览器发出请求时的完整URL，包括协议 主机名 端口(如果有): ").append(request.getRequestURL()).append("<br />");
        html.append("浏览器发出请求的资源名部分，去掉了协议和主机名: ").append(request.getRequestURI()).append("<br />");
        html.append("请求行中的参数部分: ").append(request.getQueryString()).append("<br />");
        html.append("浏览器所处于的客户机的IP地址: ").append(request.getRemoteAddr()).append("<br />");
        html.append("浏览器所处于的客户机的主机名: ").append(request.getRemoteHost()).append("<br />");
        html.append("浏览器所处于的客户机使用的网络端口: ").append(request.getRemotePort()).append("<br />");
        html.append("服务器的IP地址: ").append(request.getLocalAddr()).append("<br />");
        html.append("服务器的主机名: ").append(request.getLocalName()).append("<br />");
        html.append("得到客户机请求方式: ").append(request.getMethod()).append("<br />");
        html.append("<br />");
// 
//        if ("admin".equals(name) && "123".equals(password))
//            html = "<div style='color:green'>登录成功</div>";
//        else
//            html = "<div style='color:red'>登录失败</div>";
// 
//        response.setContentType("text/html; charset=UTF-8");
//        PrintWriter pw = response.getWriter();
//        pw.println(html);
        
        
//        request.getParameter(): 是常见的方法，用于获取单值的参数
//        request.getParameterValues(): 用于获取具有多值的参数，比如注册时候提交的 "hobits"，可以是多选的。
//        request.getParameterMap(): 用于遍历所有的参数，并返回Map类型。
        
        System.out.println("获取单值参数name:" + request.getParameter("name"));
        
        String[] hobits = request.getParameterValues("hobits");
        System.out.println("获取具有多值的参数hobits: " + Arrays.asList(hobits));
 
        System.out.println("通过 getParameterMap 遍历所有的参数： ");
        Map<String, String[]> parameters = request.getParameterMap();
 
        html.append("<<<这一部分是打印request里面带有的参数信息！>>>").append("<br />");
        
        Set<String> paramNames = parameters.keySet();
        for (String param : paramNames) {
            String[] value = parameters.get(param);
            System.out.println(param + ":" + Arrays.asList(value));
            html.append(param).append(":").append(Arrays.asList(value)).append("<br />");
        }
        
        html.append("<br />");
        
        
//        request.getHeader() 获取浏览器传递过来的头信息。 
//        比如getHeader("user-agent") 可以获取浏览器的基本资料，这样就能判断是firefox、IE、chrome、或者是safari浏览器
//        request.getHeaderNames() 获取浏览器所有的头信息名称，根据头信息名称就能遍历出所有的头信息
//
//        在本例，修改HelloServlet,使其获取头信息
//        访问HelloServlet获取如下头信息:
//        host: 主机地址
//        user-agent: 浏览器基本资料
//        accept: 表示浏览器接受的数据类型
//        accept-language: 表示浏览器接受的语言
//        accept-encoding: 表示浏览器接受的压缩方式，是压缩方式，并非编码
//        connection: 是否保持连接
//        cache-control: 缓存时限
        
        html.append("<<<这一部分是打印request的头信息>>>").append("<br />");
        Enumeration<String> headerNames= request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String header = headerNames.nextElement();
            String value = request.getHeader(header);
            html.append(header).append("  information is : ").append(value).append("<br />");
            System.out.printf("%s\t%s%n",header,value);
        }
         
//        try {
//            response.getWriter().println("<h1>Hello Servlet!</h1>");
//            response.getWriter().println(new Date().toLocaleString());
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = response.getWriter();
        pw.println(html);
    }

}

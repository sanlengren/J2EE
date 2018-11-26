import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
public class LoginServlet extends HttpServlet {
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        
        System.out.println("LoginServlet was called");
//        String html = null;
  
        if ("admin".equals(name) && "123".equals(password))
        	//直接返回html,使用类后面的writer输出，页面就可以更新
        	//html = "<div style='color:green'>success</div>";
        
        
        	request.getRequestDispatcher("success.html").forward(request, response);
        	//以上展示了服务端跳转
        else
        	response.sendRedirect("fail.html");
        	//以上展示了客户端跳转
        	//html = "<div style='color:red'>fail</div>";
        	//直接返回html,使用类后面的writer输出，页面就可以更新

        
        //        PrintWriter pw = response.getWriter();
//        pw.println(html);
    }
}
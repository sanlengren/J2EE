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
        	//ֱ�ӷ���html,ʹ��������writer�����ҳ��Ϳ��Ը���
        	//html = "<div style='color:green'>success</div>";
        
        
        	request.getRequestDispatcher("success.html").forward(request, response);
        	//����չʾ�˷������ת
        else
        	response.sendRedirect("fail.html");
        	//����չʾ�˿ͻ�����ת
        	//html = "<div style='color:red'>fail</div>";
        	//ֱ�ӷ���html,ʹ��������writer�����ҳ��Ϳ��Ը���

        
        //        PrintWriter pw = response.getWriter();
//        pw.println(html);
    }
}
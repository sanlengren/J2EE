import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class LoginReceiveChineseServerlet extends HttpServlet {
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
 
        System.out.println("LoginReceiveChineseServerlet was called");
        // byte[] bytes = name.getBytes("ISO-8859-1");
        // name = new String(bytes, "UTF-8");
 
//        String password = request.getParameter("password");
 
        System.out.println("name:" + name);
 
    }
 
}
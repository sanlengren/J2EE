import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cRUDwithJDBC.Hero;
import net.sf.json.JSONObject; 
   
public class GetOneServlet extends HttpServlet { 
    protected void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
          
        Hero hero = new Hero();
        hero.setName("¸ÇÂ×");
        hero.setHp(353);
         
        JSONObject json= new JSONObject();
   
        json.put("hero", JSONObject.fromObject(hero));
        response.setContentType("text/html;charset=utf-8"); 
        response.getWriter().print(json);
    } 
} 
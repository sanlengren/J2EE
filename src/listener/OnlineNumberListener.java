package listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
//import org.apache.catalina.core.ApplicationContext;

public class OnlineNumberListener implements HttpSessionListener{
    
	private static int _totalSessions = 0;
	ServletContext a = null;
	
	public void OnlineNumberListener(){
		
	}
	
	public int getTotalNumber(){
		return _totalSessions;
	}
	@Override
    public void sessionCreated(HttpSessionEvent e) {
 
//		a = e.getSession().getServletContext();	
//
//		
//		if(a.getAttribute("TotalCount").equals(null)){
//			a.setAttribute("TotalCount", _totalSessions);
//		}
//		
    
        synchronized(this){
        	_totalSessions++;
        	System.out.println(this.toString() + 
        			"������ session ����, sessionid �ǣ� " 
        			+ e.getSession().getId() 
        			+ "count + 1"
        			+ "��ǰ��session��" + _totalSessions);
//        	a.setAttribute("TotalCount", _totalSessions);
        }
	}
 
    @Override
    public void sessionDestroyed(HttpSessionEvent e) {
//    	a = e.getSession().getServletContext();	
//    	
//		if(a.getAttribute("TotalCount").equals(null)){
//			a.setAttribute("TotalCount", _totalSessions);
//		}
		
        synchronized(this){
        	_totalSessions--;
        	System.out.println(this.toString() + 
        			"������ session ����, sessionid �ǣ� " 
        			+ e.getSession().getId() 
        			+ "count - 1"
        			+ "��ǰ��session��" + _totalSessions);
//        	a.setAttribute("TotalCount", _totalSessions);
        }
//        System.out.println(this.toString() + "������ session ����, sessionid �ǣ� " + e.getSession().getId());
    }
}

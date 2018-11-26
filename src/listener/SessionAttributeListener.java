package listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SessionAttributeListener implements HttpSessionAttributeListener {
	 
    @Override
    public void attributeAdded(HttpSessionBindingEvent e) {
 
        System.out.println(this.toString() + "session 增加属性 ");
        System.out.println(this.toString() + "属性是" + e.getName());
        System.out.println(this.toString() + "值是" + e.getValue());
 
    }
 
    @Override
    public void attributeRemoved(HttpSessionBindingEvent e) {
        // TODO Auto-generated method stub
        System.out.println(this.toString() + "session 移除属性 ");
        System.out.println(this.toString() + "属性是" + e.getName());
        System.out.println(this.toString() + "值是" + e.getValue());
 
 
    }
 
    @Override
    public void attributeReplaced(HttpSessionBindingEvent e) {
        // TODO Auto-generated method stub
        System.out.println("session 替换属性 ");
 
    }
}

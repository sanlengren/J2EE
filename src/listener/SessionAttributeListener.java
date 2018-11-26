package listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SessionAttributeListener implements HttpSessionAttributeListener {
	 
    @Override
    public void attributeAdded(HttpSessionBindingEvent e) {
 
        System.out.println(this.toString() + "session �������� ");
        System.out.println(this.toString() + "������" + e.getName());
        System.out.println(this.toString() + "ֵ��" + e.getValue());
 
    }
 
    @Override
    public void attributeRemoved(HttpSessionBindingEvent e) {
        // TODO Auto-generated method stub
        System.out.println(this.toString() + "session �Ƴ����� ");
        System.out.println(this.toString() + "������" + e.getName());
        System.out.println(this.toString() + "ֵ��" + e.getValue());
 
 
    }
 
    @Override
    public void attributeReplaced(HttpSessionBindingEvent e) {
        // TODO Auto-generated method stub
        System.out.println("session �滻���� ");
 
    }
}

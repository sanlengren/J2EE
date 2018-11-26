package listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {
	 
    @Override
    public void requestDestroyed(ServletRequestEvent arg0) {
        System.out.println(this.toString() + "������һ��Request ");
    }
 
    @Override
    public void requestInitialized(ServletRequestEvent arg0) {
        System.out.println(this.toString() + "������һ��Request ");
    }
 
    @Override
    public void attributeAdded(ServletRequestAttributeEvent e) {
        System.out.println(this.toString() + "request �������� ");
        System.out.println(this.toString() + "������" + e.getName());
        System.out.println(this.toString() + "ֵ��" + e.getValue());
    }
 
    @Override
    public void attributeRemoved(ServletRequestAttributeEvent arg0) {
        System.out.println(this.toString() + "request �Ƴ����� ");
         
    }
 
    @Override
    public void attributeReplaced(ServletRequestAttributeEvent arg0) {
        System.out.println(this.toString() + "request �滻���� ");
         
    }
}

package listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {
	 
    @Override
    public void requestDestroyed(ServletRequestEvent arg0) {
        System.out.println(this.toString() + "销毁了一个Request ");
    }
 
    @Override
    public void requestInitialized(ServletRequestEvent arg0) {
        System.out.println(this.toString() + "创建了一个Request ");
    }
 
    @Override
    public void attributeAdded(ServletRequestAttributeEvent e) {
        System.out.println(this.toString() + "request 增加属性 ");
        System.out.println(this.toString() + "属性是" + e.getName());
        System.out.println(this.toString() + "值是" + e.getValue());
    }
 
    @Override
    public void attributeRemoved(ServletRequestAttributeEvent arg0) {
        System.out.println(this.toString() + "request 移除属性 ");
         
    }
 
    @Override
    public void attributeReplaced(ServletRequestAttributeEvent arg0) {
        System.out.println(this.toString() + "request 替换属性 ");
         
    }
}

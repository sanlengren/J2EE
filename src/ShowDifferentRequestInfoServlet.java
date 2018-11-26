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
 
		
//		request.getRequestURL(): �������������ʱ������URL������Э�� ������ �˿�(�����)" + 
//		request.getRequestURI(): ����������������Դ�����֣�ȥ����Э���������" + 
//		request.getQueryString(): �������еĲ������֣�ֻ����ʾ��get��ʽ�����Ĳ�����post��ʽ�Ŀ�����
//		request.getRemoteAddr(): ����������ڵĿͻ�����IP��ַ
//		request.getRemoteHost(): ����������ڵĿͻ�����������
//		request.getRemotePort(): ����������ڵĿͻ���ʹ�õ�����˿�
//		request.getLocalAddr(): ��������IP��ַ
//		request.getLocalName(): ��������������
//		request.getMethod(): �õ��ͻ�������ʽһ����GET����POST
		
        System.out.println("�������������ʱ������URL������Э�� ������ �˿�(�����): " + request.getRequestURL());
        System.out.println("����������������Դ�����֣�ȥ����Э���������: " + request.getRequestURI());
        System.out.println("�������еĲ�������: " + request.getQueryString());
        System.out.println("����������ڵĿͻ�����IP��ַ: " + request.getRemoteAddr());
        System.out.println("����������ڵĿͻ�����������: " + request.getRemoteHost());
        System.out.println("����������ڵĿͻ���ʹ�õ�����˿�: " + request.getRemotePort());
        System.out.println("��������IP��ַ: " + request.getLocalAddr());
        System.out.println("��������������: " + request.getLocalName());
        System.out.println("�õ��ͻ�������ʽ: " + request.getMethod());
 
        StringBuilder html = new StringBuilder();
        html.append("<<<��һ�����Ǵ�ӡrequest������еĻ�����Ϣ>>>").append("<br />");
        html.append("�������������ʱ������URL������Э�� ������ �˿�(�����): ").append(request.getRequestURL()).append("<br />");
        html.append("����������������Դ�����֣�ȥ����Э���������: ").append(request.getRequestURI()).append("<br />");
        html.append("�������еĲ�������: ").append(request.getQueryString()).append("<br />");
        html.append("����������ڵĿͻ�����IP��ַ: ").append(request.getRemoteAddr()).append("<br />");
        html.append("����������ڵĿͻ�����������: ").append(request.getRemoteHost()).append("<br />");
        html.append("����������ڵĿͻ���ʹ�õ�����˿�: ").append(request.getRemotePort()).append("<br />");
        html.append("��������IP��ַ: ").append(request.getLocalAddr()).append("<br />");
        html.append("��������������: ").append(request.getLocalName()).append("<br />");
        html.append("�õ��ͻ�������ʽ: ").append(request.getMethod()).append("<br />");
        html.append("<br />");
// 
//        if ("admin".equals(name) && "123".equals(password))
//            html = "<div style='color:green'>��¼�ɹ�</div>";
//        else
//            html = "<div style='color:red'>��¼ʧ��</div>";
// 
//        response.setContentType("text/html; charset=UTF-8");
//        PrintWriter pw = response.getWriter();
//        pw.println(html);
        
        
//        request.getParameter(): �ǳ����ķ��������ڻ�ȡ��ֵ�Ĳ���
//        request.getParameterValues(): ���ڻ�ȡ���ж�ֵ�Ĳ���������ע��ʱ���ύ�� "hobits"�������Ƕ�ѡ�ġ�
//        request.getParameterMap(): ���ڱ������еĲ�����������Map���͡�
        
        System.out.println("��ȡ��ֵ����name:" + request.getParameter("name"));
        
        String[] hobits = request.getParameterValues("hobits");
        System.out.println("��ȡ���ж�ֵ�Ĳ���hobits: " + Arrays.asList(hobits));
 
        System.out.println("ͨ�� getParameterMap �������еĲ����� ");
        Map<String, String[]> parameters = request.getParameterMap();
 
        html.append("<<<��һ�����Ǵ�ӡrequest������еĲ�����Ϣ��>>>").append("<br />");
        
        Set<String> paramNames = parameters.keySet();
        for (String param : paramNames) {
            String[] value = parameters.get(param);
            System.out.println(param + ":" + Arrays.asList(value));
            html.append(param).append(":").append(Arrays.asList(value)).append("<br />");
        }
        
        html.append("<br />");
        
        
//        request.getHeader() ��ȡ��������ݹ�����ͷ��Ϣ�� 
//        ����getHeader("user-agent") ���Ի�ȡ������Ļ������ϣ����������ж���firefox��IE��chrome��������safari�����
//        request.getHeaderNames() ��ȡ��������е�ͷ��Ϣ���ƣ�����ͷ��Ϣ���ƾ��ܱ��������е�ͷ��Ϣ
//
//        �ڱ������޸�HelloServlet,ʹ���ȡͷ��Ϣ
//        ����HelloServlet��ȡ����ͷ��Ϣ:
//        host: ������ַ
//        user-agent: �������������
//        accept: ��ʾ��������ܵ���������
//        accept-language: ��ʾ��������ܵ�����
//        accept-encoding: ��ʾ��������ܵ�ѹ����ʽ����ѹ����ʽ�����Ǳ���
//        connection: �Ƿ񱣳�����
//        cache-control: ����ʱ��
        
        html.append("<<<��һ�����Ǵ�ӡrequest��ͷ��Ϣ>>>").append("<br />");
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

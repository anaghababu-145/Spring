package org.face.SpringHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext beanFactory=new ClassPathXmlApplicationContext("web.xml");
    	Hello myBean=(Hello) beanFactory.getBean("anu");
    	myBean.printHello();
    }
}

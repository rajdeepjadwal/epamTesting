package springFramework;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client1 {

	
	
public static void main(String[] args) {
	
	//Spring way |IOC(Inversion of control)
	
	//Resource resource=new ClassPathResource("employeebean.xml");
	//BeanFactory factory=new XmlBeanFactory(resource); //spring container which shall parse XML file and construct the object

	//Application context
	ApplicationContext context=new ClassPathXmlApplicationContext("employeebean.xml");
	
	
	//common for Bean and  Application context
	
	Employee1 e3=(Employee1) context.getBean("emp3");
	
	System.out.println("Employee1 Details :"+e3);
	
	ClassPathXmlApplicationContext cxt=(ClassPathXmlApplicationContext)context;
	cxt.close(); //close the context
	
	
}
}

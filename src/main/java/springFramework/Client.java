package springFramework;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	
	
public static void main(String[] args) {
	
	//Spring way |IOC(Inversion of control)
	
	//Resource resource=new ClassPathResource("employeebean.xml");
	//BeanFactory factory=new XmlBeanFactory(resource); //spring container which shall parse XML file and construct the object

	//Application context
	ApplicationContext context=new ClassPathXmlApplicationContext("employeebean.xml");
	
	
	//common for Bean and  Application context
	
	Employee e1=(Employee) context.getBean("emp1");
	Employee e2=context.getBean("emp2", Employee.class);
	
	System.out.println("Employee1 Details :"+e1);
	System.out.println("Employee2 Details :"+e2);
	
	ClassPathXmlApplicationContext cxt=(ClassPathXmlApplicationContext)context;
	cxt.close(); //close the context
	
	
}
}

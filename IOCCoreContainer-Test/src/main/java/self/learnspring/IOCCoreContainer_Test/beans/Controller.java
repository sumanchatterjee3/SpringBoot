package self.learnspring.IOCCoreContainer_Test.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("resources/spring.xml");
		
		BeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("Document Valid");
		
		factory.getBean("beans.Test");
		

	}

}

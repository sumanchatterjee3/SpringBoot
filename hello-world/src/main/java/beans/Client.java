package beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find xml file
		Resource r = new ClassPathResource("resources/spring.xml");

		// Load xml file into container
		BeanFactory factory = new XmlBeanFactory(r);

		// create test class object
		Object o = factory.getBean("t");
		Object o1 = factory.getBean("t");
		Object o2 = factory.getBean("t");
		Object o3 = factory.getBean("t");
		Test t = (Test) o;
		Test t1 = (Test)o1;
		Test t2 = (Test)o2;
		Test t3 = (Test)o3;
		t.hello();
		t1.hello();
		t2.hello();
		t3.hello();
		System.out.println(o==(o1));
		System.out.println(o1==(o2));
		System.out.println(o2.equals(o3));
		
	}

}

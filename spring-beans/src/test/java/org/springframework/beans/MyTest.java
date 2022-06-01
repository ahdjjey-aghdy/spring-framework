package org.springframework.beans;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.util.Map;

public class MyTest {
	@Test
    public void MyTestFactory(){
		BeanFactory bt = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTest bean=(MyTest ) bt.getBean("myTestBean");
		System.out.println(bean);

	}

}

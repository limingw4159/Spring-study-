package Spring01.FactoryBean;

import Spring01.注入集合属性.Course;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {
    @Test
    public void test3(){
        ApplicationContext context= new ClassPathXmlApplicationContext("Spring01/FactoryBean/bean.xml");
        Course course = context.getBean("MyBean", Course.class);
        System.out.println(course );

    }}

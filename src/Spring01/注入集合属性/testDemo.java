package Spring01.注入集合属性;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDemo {
    @Test
    public void TestSpring5(){
        ApplicationContext context= new ClassPathXmlApplicationContext("Spring01/注入集合属性/bean.xml");
        Student stu = context.getBean("stu", Student.class);
        stu.test();


    }}

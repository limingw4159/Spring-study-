package Spring01.自动装配;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    @Test
    public void TedeDemo01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring01/自动装配/bean.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.test();
        System.out.println(emp);

    }
}

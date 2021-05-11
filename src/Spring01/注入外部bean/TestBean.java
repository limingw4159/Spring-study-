package Spring01.注入外部bean;

import Spring01.注入外部bean.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void testAdd(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring01/注入外部bean/bean2.xml");

        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}

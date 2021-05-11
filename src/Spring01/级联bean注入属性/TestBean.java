package Spring01.级联bean注入属性;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void testBean3(){
        //1加载配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring01/级联bean注入属性/bean3.xml");
        //获取配置创建的对象
        Emp emp =context.getBean("emp",Emp.class);
        //调用add的方法
        emp.add();
    }
    @Test
    public void testBean4(){
        ApplicationContext context= new ClassPathXmlApplicationContext("Spring01/级联bean注入属性/bean4.xml");
        Emp emp = context.getBean("emp",Emp.class);
        emp.add();
    }
}

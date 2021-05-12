package Spring01.Bean生命周期;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBean {

    @Test
    public void testDemo(){
//        ApplicationContext context=new ClassPathXmlApplicationContext("Spring01/Bean生命周期/bean.xml");
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Spring01/Bean生命周期/bean.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);
        //手动让bean实例销毁,写法一：把context 强转成ClassPathXmlApplicationContext
//        ((ClassPathXmlApplicationContext)context).close();
        //方法二：直接把上面的ApplicationContext换成ClassPathXmlApplicationContext
        context.close();
    }
}

package Spring01.把list提取出来;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testlist
{

    @Test
            public void testDemo(){
        ApplicationContext context= new ClassPathXmlApplicationContext("Spring01/把list提取出来/bean.xml");
        Book book = context.getBean("book", Book.class);
        book.test();
    }

}

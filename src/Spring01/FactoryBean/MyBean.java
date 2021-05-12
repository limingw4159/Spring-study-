package Spring01.FactoryBean;

import Spring01.注入集合属性.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course> {

//定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course=new Course();
        course.setCname("Math");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
//是不是单例
    @Override
    public boolean isSingleton() {
        return false;
    }
}

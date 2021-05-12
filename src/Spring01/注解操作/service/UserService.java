package Spring01.注解操作.service;

import Spring01.注解操作.DAO.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Component(value = "userService") //类似于  <bean id="userService" class="....">
public class UserService {

    @Value(value="abc")
    private String name;

    //定义dao类型属性
    //不需要添加set方法
    //添加注入属性注解
//    @Autowired //根据类型进行注入,找到userDao这个类
//    @Qualifier(value = "userDaoImp1")
    @Resource //根据类型进行注入
//    @Resource(name = "userDaoImp1") //根据名称进行注入
    private UserDao userDao;

    public void add(){
        System.out.println("service add" + name);
        userDao.add();
    }
}

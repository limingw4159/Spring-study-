package Spring01.注入外部bean.service;

import Spring01.注入外部bean.dao.UserDao;
import Spring01.注入外部bean.dao.UserDaoImp1;

public class UserService {

    public void add(){
        System.out.println("service add........");

        //原始方式：创建UserDao对象
        UserDao userDao = new UserDaoImp1();
        userDao.update();
    }

}

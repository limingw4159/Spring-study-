package Spring01.outsideBean.service;

import Spring01.outsideBean.dao.UserDao;
import Spring01.outsideBean.dao.UserDaoImp1;

public class UserService {

    public void add(){
        System.out.println("service add........");

        //原始方式：创建UserDao对象
        UserDao userDao = new UserDaoImp1();
        userDao.update();
    }

}

package Spring01.outsideBean.dao;

public class UserDaoImp1 implements UserDao{

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void update() {
        System.out.println("dao update.........");
    }
}

package Spring01.注解操作.DAO;


import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImp1 ")
public class UserDaoImp implements UserDao {
    @Override
    public void add() {
        System.out.println("add UserDao");
    }
}

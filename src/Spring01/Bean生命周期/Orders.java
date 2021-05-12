package Spring01.Bean生命周期;

public class Orders {
    private String  oname;

    public Orders() {
        System.out.println("第一步执行无参数构造器bean实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二部 调用set方法设置属性的值");

    }

    //创建执行的初始化的方法
    public void initMethod(){
        System.out.println("第三步 执行初始化的方法");
    }
    //创建执行的销毁的方法
    public void destoryMethod(){
        System.out.println("第5步 执行销毁方法");
    }
}

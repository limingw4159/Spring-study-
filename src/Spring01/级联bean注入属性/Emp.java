package Spring01.级联bean注入属性;

//员工类
public class Emp {
    private String ename;
    private String gender;
//生成dept的get方法用于设置dept的dname值
    public Dept getDept() {
        return dept;
    }

    //员工属于某一个部门，使用对象形式表示
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void add(){
        System.out.println(ename+ "::"+gender+"::"+dept);
    }

}

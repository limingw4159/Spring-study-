package Spring01.注入集合属性;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    //1.数组类型属性
    private String[] courses;

    //2.list集合类型属性
    private List<String> list;

    //3map集合类型属性
    private Map<String,String > maps;
//    4.set集合类属性
    private Set<String> sets;
    //生成3个set方法
    //学生所学多门课程
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSet(Set<String> sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", maps=" + maps +
                ", sets=" + sets +
                ", courseList=" + courseList +
                '}';
    }

    public void test(){
        System.out.println(toString());
    }
}

package Spring01.注入集合属性;

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
    private Set<String> set;
    //生成3个set方法
    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }
}

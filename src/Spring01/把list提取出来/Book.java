package Spring01.把list提取出来;

import java.util.List;

public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Book{" +
                "list=" + list +
                '}';
    }
    public void test(){
        System.out.println(toString());
    }
}

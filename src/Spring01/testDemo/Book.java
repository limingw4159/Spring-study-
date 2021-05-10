package Spring01.testDemo;

public class Book{
    private String bname;
    private String bauthor;
    private String address;

    public Book(String bname, String bauthor, String address) {
        this.bname = bname;
        this.bauthor = bauthor;
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Book() {

    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
    public void testDemo(){

        System.out.println(bname+"::"+ bauthor+ "::" +address);
    }}

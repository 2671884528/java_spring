package scope;

public class Name {
    private String name;

    public Name(String name) {
        this.name = name;
        System.out.println("自动注入"+this);
    }

    public Name() {
        super();
    }

    public void add(){
        System.out.println(name+this);
    }

    public void init(){
        System.out.println("自动生成对象-----");
    }

    public void destroy(){
        System.out.println("自动销毁对象-----");
    }

}

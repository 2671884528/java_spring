package gyg;

/*
 *调用Use
 */
public class Use2 {
    private String[] name;
    private Use use;

    public Use getUse() {
        return use;
    }

    public void setUse(Use use) {
        this.use = use;
    }

    public Use2() {
        super();
    }

    public Use2(String[] name, Use use) {
        this.name = name;
        this.use = use;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public void print(){
        System.out.println(use.getName() + ">>>>>>>" + use.getAge());
        System.out.println(">>>>>>>>>>>>>>>>>");
        for (String s : this.name) {
            System.out.println(s);
        }
    }
}

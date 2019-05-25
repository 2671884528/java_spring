package gyg;

public class Add {
    private int one;
    private int two;
    private String str1;
    private String str2;

    public Add(int a, int b) {
        System.out.println("自动装配加整数");
        this.one = a;
        this.two = b;
    }

    public Add(String str1, String str2) {
        System.out.println("自动装配加字符串");
        this.str1 = str1;
        this.str2 = str2;
    }

    public Add(int a, String str1) {
        System.out.println("自动装配加字符串和数字");
        this.one = a;
        this.str1 = str1;
    }

    public void add(int a) {
        System.out.println("a+b=" + (one + two));
    }

    public void add(String a) {
        System.out.println("a+b=" + (str1 + str2));
    }

    public void add(){
        System.out.println("a+str1="+(str1+one));
    }
}

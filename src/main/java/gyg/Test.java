package gyg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-contractor.xml");
        UserService festival1 = (UserServiceAdd_festival) context.getBean("one");
        UserService festival2 = (UserServiceAdd_festival) context.getBean("two");
//        UserService festival = (UserServiceAdd_festival) context.getBean("serviceAdd_festival");
        festival1.add();
        festival2.add();
    }
}

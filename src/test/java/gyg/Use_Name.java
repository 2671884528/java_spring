package gyg;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Use_Name {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-property.xml");


    @Test
    public void add(){
        Use2 use2 = (Use2) context.getBean("use2");
        use2.print();
    }
}

package gyg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-property.xml")
public class UseName {
    @Autowired
    private Use use;
    @Test
    public void use(){
        System.out.println("名字："+use.getName()+"    "+"年龄："+use.getAge());
    }

}

package scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Name1 {

    @Autowired
    @Qualifier("name")
    @Lazy
    private Name name1;

    @Autowired
    @Qualifier("name")
    @Lazy//延迟加载
    private Name name2;
   @Test
    public void run(){
       name1.add();
       name2.add();
    }
}

package gyg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-contractor.xml")
public class TacticalName {
    @Autowired
    private Tactical tactical1,tactical2,tactical3;

    @Test
    public void run1(){
        tactical1.getFestival().add();
    }

    @Test
    public void run2(){
        tactical2.getFestival().add();
    }

    @Test
    public void run3(){
        tactical2.getFestival().add();
    }
}

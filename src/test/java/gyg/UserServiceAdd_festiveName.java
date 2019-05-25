package gyg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-contractor.xml")
public class UserServiceAdd_festiveName {
    //以下设置的名字要和在定义Bean的时候里面的ID一样,
    //如果你实在是不想一样可以加Qualifier("")
    @Autowired
    private UserServiceAdd_festival one;

    @Autowired
    private UserServiceAdd_festival two;

    @Autowired
    @Qualifier("two")
    private UserServiceAdd_festival other;

    @Test
    public void text(){
        one.add();
        two.add();
        other.add();
    }
}

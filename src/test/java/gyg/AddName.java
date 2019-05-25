package gyg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-contractor.xml")
public class AddName {

    @Autowired
    private Add add;
    @Autowired
    private Add add2;
    @Autowired
    private Add add3;
    @Test
    public void add() {
        int a = 0;
        String string = "";
        add.add(a);
        add2.add(string);
        add3.add();
    }
}

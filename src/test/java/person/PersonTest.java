package person;

import factory.Person;
import factory.PersonFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class PersonTest {

    @Autowired
    @Qualifier("personFactory")
    Person person;
    //通过如下配置的bean无法找到personFactory，返回的并不是PersonFactory对象
    // <bean class="factory.PersonFactory" factory-method="getPerson"
    // id="personFactory"></bean>
    //  @Autowired
    //  PersonFactory personFactory;

    @Autowired
    PersonFactory personFactory;
    @Test
    public void run() {
//        person.print();
        personFactory.getPerson1();
    }
}

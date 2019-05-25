package hello;
//通过配置spring-text配置

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class AppName02 {
    @Autowired
    //自动装配
    private CD_play play;
    @Test
        public void test(){
            play.play();
        }
}

package hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//通过配置junit调用test注解
public class AppName {
    @Test
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CD_play cd_play = context.getBean(CD_play.class);
        cd_play.play();

    }
}

package hello;
/**
 * 让主类和注解解耦
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan
@Configuration
public class AppConfig {
}

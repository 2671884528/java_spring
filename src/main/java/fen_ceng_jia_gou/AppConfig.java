package fen_ceng_jia_gou;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@ComponentScan
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class AppConfig {
}

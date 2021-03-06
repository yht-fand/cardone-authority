package top.cardone;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import top.cardone.context.annotation.CardOneAnnotationBeanNameGenerator;

/**
 * 主执行端
 *
 * @author yao hai tao
 */
@Configuration
@ComponentScan(basePackages = {"top.cardone"}, nameGenerator = CardOneAnnotationBeanNameGenerator.class, lazyInit = true)
@Import({
        org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration.class,
        org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration.class
})
@ImportResource(value = {"file:config/applicationContext.xml", "file:config/applicationContext.groovy"},
        reader = org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.class)
public class CardoneProviderApplication {
    /**
     * 主方法
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        SpringApplication.run(CardoneProviderApplication.class, args);
    }
}
package com.practice.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

/**
 * SpringBootApplication 包括 @ComponentScan，和 @SpringBootConfiguration，@EnableAutoConfiguration。
 * SpringBootConfiguration继承自@Configuration标注当前类是配置类，并会将当前类内声明的一个或多个以@Bean注解标记的方法的实例纳入到srping容器中，并且实例名就是方法名，
 * EnableAutoConfiguration Springboot根据你添加的jar包来配置你项目的默认配置
 * ComponentScan 扫描当前包及其子包下被@Component，@Controller，@Service，@Repository注解标记的类并纳入到spring容器中进行管理。是以前的<context:component-scan>（以前使用在xml中使用的标签，用来扫描包配置的平行支持）
 */
@SpringBootApplication(scanBasePackages = "com.practice.test.*")
public class TestFactoryApplication {

    @Value("${server.tomcat.protocol:org.apache.coyote.http11.Http11Nio2Protocol}")
    private String tomcatProtocol;

    public static void main(String[] args) {
        SpringApplication.run(TestFactoryApplication.class, args);
    }

    @Bean
    public ServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.setProtocol(tomcatProtocol);
        return tomcat;
    }
}

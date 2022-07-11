package org.bnt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//!!! JavaConfiguration instead of web.xml
@Configuration

@ComponentScan("org.bnt")
@SpringBootApplication(scanBasePackages = {"org.bnt"})
@MapperScan("org.bnt.mapper")
@PropertySource("classpath:application.properties")
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ServletInitializer.class);
    }

    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(
                ServletInitializer.class);
        sa.run(args);
    }
}

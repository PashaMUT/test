package org.bnt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan({"org.bnt"})
public class MvcConfig implements WebMvcConfigurer{
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("").setViewName("login");
        registry.addViewController("provider").setViewName("provider");
        registry.addViewController("addProvider").setViewName("addProvider");
    }

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/styles/**").addResourceLocations("/WEB-INF/styles/");
        registry.addResourceHandler("/scripts/**").addResourceLocations("/WEB-INF/scripts/");
    }

    @Bean
    public FreeMarkerViewResolver freemarkerViewResolver() {
        FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
        resolver.setCache(false);
        resolver.setPrefix("");
        resolver.setSuffix(".ftl");
        return resolver;
    }

    @Bean
    public FreeMarkerConfigurer freemarkerConfig() {
        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
        freeMarkerConfigurer.setDefaultEncoding("UTF-8");
        freeMarkerConfigurer.setTemplateLoaderPath("/WEB-INF/views/ftl/");
        return freeMarkerConfigurer;
    }
}

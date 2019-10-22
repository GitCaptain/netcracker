package controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MVCConfig {

    @Configuration
    public class ConfigMVC implements WebMvcConfigurer {

        public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/login_view").setViewName("login");
            registry.addViewController("/list_room_view").setViewName("rooms");
            registry.addViewController("/list_instruments_view").setViewName("instruments");
            registry.addViewController("/main_view").setViewName("main page");
        }

    }

}

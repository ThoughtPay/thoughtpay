package com.thoughtpay;

import com.thoughtpay.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.HashMap;

@Configuration
public class BeanConfiguration {

    @Bean
    public HashMap<String, User> getAllUsers() {
        HashMap<String, User> userMap = new HashMap<>();
        for (User user : UserBuilder.allUsers) {
            userMap.put(user.getId(), user);
        }

        return userMap;
    }



    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/pages/");
        resolver.setSuffix(".jsp");

        return resolver;
    }

}

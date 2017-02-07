package com.thoughtpay;

import com.thoughtpay.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class BeanConfiguration {

    @Bean
    public HashMap<String, User> allUsers() {
        HashMap<String, User> result = new HashMap<String, User>();
        result.put("1", new User("1", "nwinston", "Napoleon", "Winston"));
        result.put("2", new User("2", "wsugar", "Whiskers", "Sugar"));
        result.put("3", new User("3", "sharley", "Sylvester", "Harley"));

        return result;
    }

}

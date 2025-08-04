package com.springbean.config;

import com.springbean.model.Item;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContexConfig {

    @Bean
    public Item anyItem(){
        return new Item(1L,"any-item");
    }
}

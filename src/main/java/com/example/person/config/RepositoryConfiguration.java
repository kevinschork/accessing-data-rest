package com.example.person.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.person.eventhandler.PersonEventHandler;

@Configuration
public class RepositoryConfiguration{
    
    public RepositoryConfiguration(){
        super();
    }
 
    @Bean
    PersonEventHandler personEventHandler() {
        return new PersonEventHandler();
    }
 
}

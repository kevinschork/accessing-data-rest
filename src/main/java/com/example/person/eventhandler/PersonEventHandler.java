package com.example.person.eventhandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleAfterDelete;
import org.springframework.data.rest.core.annotation.HandleAfterSave;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import com.example.person.model.Person;

@RepositoryEventHandler(Person.class) 
public class PersonEventHandler {
    
	private static final Logger LOG = LoggerFactory.getLogger(PersonEventHandler.class);
    
    @HandleBeforeCreate
    public void handlePersonBeforeCreate(Person person){
    	LOG.info("Inside Person Before Create....");
    }
 
    @HandleAfterCreate
    public void handlePersonAfterCreate(Person person){
    	LOG.info("Inside Person After Create ....");
    }
    
    @HandleBeforeSave
    public void handlePersonBeforeSave(Person person){
    	LOG.info("Inside Person Before Save....");
    }
 
    @HandleAfterSave
    public void handlePersonAfterSave(Person person){
    	LOG.info("Inside Person After Save ....");
    }
 
    @HandleBeforeDelete
    public void handlePersonBeforeDelete(Person person){
    	LOG.info("Inside Person Before Delete ....");
    }
 
    @HandleAfterDelete
    public void handlePersonAfterDelete(Person person){
    	LOG.info("Inside Person After Delete ....");
    }
}
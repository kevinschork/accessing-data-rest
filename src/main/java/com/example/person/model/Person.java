package com.example.person.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;

@Entity
@Data
public class Person {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;
	private String firstName;
	private String lastName;
	@CreationTimestamp
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDateTime dateCreated;
	@UpdateTimestamp
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDateTime dateModified;

}
